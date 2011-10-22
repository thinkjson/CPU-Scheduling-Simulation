import java.util.Vector;

public abstract class SchedulingQueue implements Runnable
{
	
	protected volatile Vector<Process> processQueue;

	private Thread[] processors;
	
	public abstract void addProcess(Process p);
	public abstract void removeProcess(Process p);
	
	public SchedulingQueue()
	{
		this(1);
	}
	
	public SchedulingQueue(int cpuCount)
	{

		// create 'processors' and start them
		processors = new Thread[cpuCount];
		for(int i = 0; i< cpuCount; i++)
		{
			processors[i] = new Thread(this);
			processors[i].start();
		}
		
		processQueue = new Vector<Process>();
	}
	
	/**
	 * Calculates the total wait time for all processes.
	 * @return
	 */
	public int getTotalWaitTime() {
		int totalWaitTime = 0;
		for(Process p : processQueue) {
			totalWaitTime += p.getWaitTime();
		}
		return totalWaitTime;
	}
	
	/**
	 * Calculates the total turn-around time for all processes.
	 * @return
	 */
	public int getTotalTurnaroundTime()	{
		int totalTurnaround = 0;
		for(Process p : processQueue) {
			totalTurnaround += p.getTurnaroundTime();
		}
		return totalTurnaround;
	}
	
	/**
	 * Gets the number of processes.
	 * @return
	 */
	public int getProcessCount() {
		return processQueue.size();
	}
	
}
