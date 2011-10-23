import java.util.HashMap;
import java.util.Random;
import java.util.Vector;


public class LotteryScheduling extends SchedulingQueue
{
	
	static final Random random = new Random();
	
	HashMap<Integer, Vector<Integer>> tickets;

	/**
	 * 
	 */
	public LotteryScheduling(int cpuCount, int quant) {
		super(cpuCount, quant);
		tickets = new HashMap<Integer, Vector<Integer>>();
	}

	@Override
	public void addProcess(Process p)
	{
		tickets.put(p.getPID(), new Vector<Integer>());
	}

	@Override
	public void removeProcess(Process p)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		
	}
	
}
