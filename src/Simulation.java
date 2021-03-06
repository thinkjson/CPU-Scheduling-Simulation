import java.util.Random;


public class Simulation {
	
	SchedulingQueue queue;
	
	int numberOfProcesses; 
	
	private static final Random rnd = new Random();

	/**
	 * 
	 */
	public Simulation(SchedulingQueue queue) {
		this.queue = queue;
	}
	
	public void start() {
		
		Process process;
		
		for (int i = 0; i < numberOfProcesses; i++) {
			process = new Process();
			process.setBurstTime(rnd.nextInt(90) + 10);
			this.queue.addProcess(process);
			
			System.out.println("Adding process");
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.print("Usage: java Simulation [algorithm] [numberOfProcesses]\n" +
					"Where algorithm is one of: \n1 - Multi-Level Feedback Queue, 2 - Lottery Scheduler, 3 - Fair Share Sscheduler");
			return;
		}
		
		int cpuCount = 4;
		int quantum = 10;
		
		int algorithm = Integer.parseInt(args[0]);
		
		Simulation simulation;
		switch (algorithm) {
		case 1:
			simulation = new Simulation(new MultilevelFeedbackQueue(cpuCount, quantum));
			break;
		case 2:
			simulation = new Simulation(new LotteryScheduling(cpuCount, quantum));
			break;
		default:
			simulation = new Simulation(new FairShareScheduling(cpuCount, quantum));
			break;
		}
		
		simulation.numberOfProcesses = Integer.parseInt(args[1]);
		simulation.start();
	}

}
