import java.util.Random;

public class Process {
	
	private int burstTime;
	private int IOTime;
	private int waitTime;
	private int turnaroundTime;
	private int PID;
	private User user;
	
	public int getPID() {
		return PID;
	}

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
	
	public void setTurnaroundTime(int turnaround)
	{
		turnaroundTime = turnaround;
	}
	
	public int getTurnaroundTime() {
		return turnaroundTime;
	}
	
}
