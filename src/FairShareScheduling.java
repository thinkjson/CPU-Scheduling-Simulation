import java.util.Vector;


public class FairShareScheduling extends SchedulingQueue {

	public static final int DEFAULT_USER_COUNT = 5;
	
	private int userCount;

	/**
	 * Creates a new FairShare scheduler.
	 * @param cpuCount
	 * @param quant
	 */
	public FairShareScheduling(int cpuCount, int quant) {
		super(cpuCount, quant);
		userCount = DEFAULT_USER_COUNT;
	}

	public void addProcess(Process p) {
		processQueue.add(p);
	}
	
	public void removeProcess(Process p) {
		processQueue.remove(p);
	}

	/**
	 * Scheduler "step"
	 */
	public void run() {



	}
	
}
