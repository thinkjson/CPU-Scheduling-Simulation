import java.util.Vector;


public class FairShareScheduling extends SchedulingQueue {
	
	// all users involved
	private Vector<User> users;
	
	/**
	 * Creates a new FairShare scheduler.
	 * @param cpuCount
	 * @param quant
	 */
	public FairShareScheduling(int cpuCount, int quant) {
		super(cpuCount, quant);
	}

	/**
	 * Adds a user to the system.
	 * @param u
	 */
	public void addUser(User u) {
		users.add(u);
	}
	
	/**
	 * Removes a user from the system.
	 * @param u
	 * @return
	 */
	public boolean removeUser(User u) {
		return users.remove(u);
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
		int splitQuantum = users.size() / quantum;
		
		int processCount;
		int userQuantum;
		for(User u : users) {

		}

	}
	
}
