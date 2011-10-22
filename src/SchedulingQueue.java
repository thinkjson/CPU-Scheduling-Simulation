import java.util.Vector;

public abstract class SchedulingQueue
{
	
	private Vector<Process> processQueue;

	public abstract addProcess(Process p);
	public abstract removeProcess(Process p);
	
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
	 * Calculates the total throughput time for all processes.
	 * @return
	 */
	public int getTotalThroughputTime()	{
		int totalThroughput = 0;
		for(Process p : processQueue) {
			totalThroughput += p.getThroughputTime();
		}
		return totalThroughput;
	}
	
	/**
	 * Gets the number of processes.
	 * @return
	 */
	public int getProcessCount() {
		return processQueue.size();
	}
	
}
