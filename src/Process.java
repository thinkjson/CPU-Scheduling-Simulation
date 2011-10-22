import java.util.Random;

public class Process {
	int burstTime;
	int IOTime;
	static final Random random = new Random();
	static final int MAX_TIME = 10000;

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
}
