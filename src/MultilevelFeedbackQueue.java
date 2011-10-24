import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;

public class MultilevelFeedbackQueue extends SchedulingQueue {
	
	private volatile LinkedBlockingQueue<Process> queueRR1;
	private volatile LinkedBlockingQueue<Process> queueRR2;
	private volatile LinkedBlockingQueue<Process> queueFIFO;

	private volatile Vector<LinkedBlockingQueue<Process>> level;
	
	public MultilevelFeedbackQueue(int cpuCount, int quant) {
		
		super(cpuCount, quant);
		
		queueRR1 = new LinkedBlockingQueue<Process>();
		queueRR2 = new LinkedBlockingQueue<Process>();
		queueFIFO = new LinkedBlockingQueue<Process>();
		
		// establish the order of levels in the MLFQ
		level = new Vector<LinkedBlockingQueue<Process>>();
		level.add(queueFIFO);
		level.add(queueRR2);
		level.add(queueRR1);


		
		isRunning = true;
	}

	public void addProcess(Process p) {
		level.elementAt(0).add(p);
	}

	public void removeProcess(Process p) {

	}
	
	public void run() {
		while(true) {
			if(isRunning) {
				step();
			}
		}
	}
	
	private void step() {

		int q = this.quantum;
		int used;
		Process proc;
		
		// we MUST process the queues in reverse order for two reasons
		// - so a process can't get promoted and re-calculated in another queue
		// - so our wait times don't get messed up
		for(int i = level.size() - 1; i >= 0; i--) {

			// retrieve first item (does not remove!)
			proc = level.get(i).peek();
			
			// no process? good bye
			if(proc == null) {
				continue;
			}

			// how much of the quantum do we need to use?
			used = q < proc.getBurstTime() ? q : proc.getBurstTime();
			proc.changeBurstTime(-1 * used);
			
			// finished and in the last fifo queue...
			if(i == level.size() - 1) {
				
				// and we're finished, lets remove this process
				if(proc.getBurstTime() == 0) {
					level.get(level.size() - 1).poll();
				}
			} 
			
			// if we aren't finished and are not in the last queue
			// remove from current queue and move to next queue
			else {
				level.get(i).poll();
				level.get(i + 1).offer(proc);
			}	
			
			// finally, we add all the wait times to the other processes
			//synchronized(level.get(i)) {
				for(Process p : level.get(i)) {
					if(p != proc) {
						p.addWaitTime(used);
					}
				}
			//}

		}
	}

}
