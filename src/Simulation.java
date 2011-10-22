
public class Simulation {
	
	SchedulingQueue queue;
	
	int numberOfProcesses; 

	/**
	 * 
	 */
	public Simulation() {
		this.queue = new SchedulingQueue();
	}
	
	public void start() {
		Process process;
		for (int i = 0; i < numberOfProcesses; i++) {
			process = new Process();
			this.queue.addProcess(process);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Simulation simulation = new Simulation();
		simulation.start();
	}

}
