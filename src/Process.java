import java.util.Random;

public class Process {
	
	private int burstTime;
	private int IOTime;
	private int waitTime;
	private int turnaroundTime;
	private int PID;
	private int user;
	
	public int getPID() {
		return PID;
	}

	private static final Random random = new Random();
	private static final int MAX_TIME = 100;

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
	
	public void setBurstTime(int time) {
		burstTime = time;
	}
	
	public int getBurstTime() {
		return burstTime;
	}
	
	public void changeBurstTime(int time) {
		burstTime += time;
	}
	
	public void setIOTime(int time) {
		IOTime = time;
	}
	
	public int getIOTime() {
		return IOTime;
	}
	
	public void setWaitTime(int wait) {
		waitTime = 0;
	}
	
	public void addWaitTime(int waited) {
		waitTime += waited;
	}
	
	public int getWaitTime() {
		return waitTime;
	}
	
	public void setTurnaroundTime(int turnaround) {
		turnaroundTime = turnaround;
	}
	
	public int getTurnaroundTime() {
		return turnaroundTime;
	}
	
	public void setUser(int u) {
		user = u;
	}
	
	public int getUser() {
		return user;
	}
	
}
