import java.util.Vector;

public abstract class SchedulingQueue
{
	
	private Vector<Process> processQueue;

	public abstract void addProcess(Process p);
	public abstract void removeProcess(Process p);
	
	public SchedulingQueue()
	{
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
