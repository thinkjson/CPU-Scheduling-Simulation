import java.util.Vector;


public class FairShareScheduling extends SchedulingQueue implements Runnable
{
	
	private Vector<User> users;

	public void addUser(User u)
	{
		users.add(u);
	}
	
	public boolean removeUser(User u)
	{
		return users.remove(u);
	}
	
	public void addProcess(Process p)
	{
		processQueue.add(p);
	}

	public void removeProcess(Process p)
	{
		processQueue.remove(p);
	}

	public void run()
	{

		
	}
	
	
	
}
