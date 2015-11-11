package ie.gmit.sw;
import java.util.*;


public class RoundRobinTest {

	public static void main(String[] args) {
		// Prompt user to enter a total number of processes
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of processes: ");
		
		// Variable / Array Declarations used by all methods
		int sum = 0;
		double sumWaitTimes = 0;
		double averageWaitTime = 0;
		
		
		// int[] waitTime = new int[processTimes.length];

		
		
		
		int numOfProcesses = input.nextInt();
		final int TIME_QUANTUM = 2;
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 0; i < numOfProcesses; i++){
			System.out.println("Please enter the burst time for each process: ");
			queue.add(input.nextInt());
		}
		
		System.out.println("Queue print out" + queue + " and size is " + queue.size());
		
		boolean found = false;
		
		for (int i = 0; i < queue.size(); i++)
		{
			// queue. -= TIME_QUANTUM; 
			for(Integer x: queue)
			{
				if(x.equals(0))
				{
					found = true;
					queue.poll();
					break;
				}
			}
		}
	
		if(found)
			System.out.println("Removed Index, new Queue is: " + queue);
		
		// System.out.println("Queue after poll " + queue);
		
		/*for (int i = 0; i < numOfProcesses; i++) {
			queue.add(i);
		}*/
		
		
		// User prompted to enter the burst size of each process, which is then stored in the array processTimes[]
		/*for(int i = 0; i < numOfProcesses; i++){
			System.out.println("Please enter the burst time for each process: ");
			processTimes[i] = input.nextInt();
			
		}*/
		
		// Display list of each process and associated burst times
/*		System.out.println("Process Array:");
		for(int x: processTimes)
			System.out.print("|" + x);
		
		
		for (int i = 0; i < processTimes.length; i++) {
			processTimes[i] -= TIME_QUANTUM;
			queue.add(i);
			
			if(p < 1){
				System.out.println("\nThis process has finished");
			}
		}
		
		
		System.out.println("\nProcess Array After deduction:");
		for(int x: processTimes)
			System.out.print("|" + x);
		
		
		System.out.println("\n\n");
		
		System.out.println("Queue roundRobin:");
		for(int i: queue)
			System.out.print("|" + i);*/
		
		
		
		
	}
}