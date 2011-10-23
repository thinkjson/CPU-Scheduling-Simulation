import java.util.LinkedList;
import java.util.Queue;


public class MultilevelFeedbackQueue extends SchedulingQueue {
	
	/*
		A process can move between the various queues; aging can be implemented this way
		Multilevel-feedback-queue scheduler defined by the following parameters:
			number of queues
			scheduling algorithms for each queue
			method used to determine when to upgrade a process
			method used to determine when to demote a process
			method used to determine which queue a process will enter when that process needs service
	 */
	
	private volatile LinkedList<Process> queueFIFO1;
	private volatile LinkedList<Process> queueFIFO2;
	private volatile LinkedList<Process> queueRR;
	
	private LinkedList[] level = {
			queueFIFO1,
			queueFIFO2,
			queueRR,
	};

	public MultilevelFeedbackQueue(int cpuCount, int quant) {
		super(cpuCount, quant);
		queueFIFO1 = new LinkedList<Process>();
		queueFIFO2 = new LinkedList<Process>();
		queueRR = new LinkedList<Process>();
	}

	/**
	 * Adds a process to the level[0] queue.
	 */
	public void addProcess(Process p) {
		level[0].add(p);
	}

	@Override
	public void removeProcess(Process p) {

	}

	@Override
	public void run() {

		int wait = 0;
		
		// fifo 1
		Process proc = queueFIFO1.poll();
		if(proc != null)
		{
			// handle time reduction
			// if the process isn't done, move to next queue
			// add wait time to other processes
			//
			for(Process p : queueFIFO1)
			{
			}
		}
		
		// fifo 2
		// [repeat]
		
		// rr
		// [repeat]

	}

}
