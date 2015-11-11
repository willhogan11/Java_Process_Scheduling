package ie.gmit.sw;
import java.util.*;


public class ListRoundRobin {

	public static void main(String[] args) {
		// Prompt user to enter a total number of processes
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of processes: ");
		
		List<Integer> rrList = new ArrayList<Integer>();
		
		int numOfProcesses = input.nextInt();
		boolean found = false;
		final int TIME_QUANTUM = 2;
		
		
		for(int i = 0; i < numOfProcesses; i++){
			System.out.println("Please enter the burst time for each process: ");
			rrList.add(input.nextInt());
		}
		
		System.out.println("RoundRobin List: " + rrList);
		
		for (Integer i: rrList){
			rrList.remove(i) -= TIME_QUANTUM;
			if(i.contains(0)){
				System.out.println(i.indexOf(numOfProcesses));
			}
		}
		
	}
}