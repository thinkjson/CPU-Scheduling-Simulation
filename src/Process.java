import java.util.Random;

public class Process {
	
	private int burstTime;
	private int IOTime;
	private int waitTime;
	private int throughputTime;
	
	private static final Random random = new Random();
	private static final int MAX_TIME = 10000;

	/**
	 * Construct a process with given CPU burst and I/O time
	 * @param burstTime
	 * @param iOTime
	 */
	public Process(int burstTime, int iOTime) {
		this.burstTime = burstTime;
		IOTime = iOTime;
	}
	
	/**
	 * Construct a process with random CPU burst and I/O time
	 * @param burstTime
	 * @param iOTime
	 */
	public Process() {
		this(random.nextInt(MAX_TIME), random.nextInt(MAX_TIME));
	}
	
	public void setWaitTime(int wait)
	{
		waitTime = 0;
	}
	
	public void addWaitTime(int waited)
	{
		waitTime += waited;
	}
	
	public int getWaitTime() {
		return waitTime;
	}
	
	public void setThroughputTime(int thruput)
	{
		throughputTime = thruput;
	}
	
	public int getTroughputTime() {
		return throughputTime;
	}
	
}
