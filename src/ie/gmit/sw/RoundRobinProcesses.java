package ie.gmit.sw;
import java.util.*;

public class RoundRobinProcesses {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of processes: ");
		
		final int TIME_QUANTUM = 2; // Just statically declared and initialised for testing purposes
		int numOfProcesses = input.nextInt();
		Integer[] processTimes = new Integer[numOfProcesses];
		Integer[] waitTimesCalc = new Integer[numOfProcesses]; // Some sort of holding array for each TIM_QUANTUM deduction
		
		
		// User prompted to enter the burst size of each process, which is then stored in the array processTimes[]
		for(int i = 0; i < numOfProcesses; i++){
			System.out.println("Please enter the burst time for each process: ");
			processTimes[i] = input.nextInt();
		}
		input.close();
		
		// Now we can deal with just the arraylist and remove where required
		List<Integer> processList = new ArrayList<Integer>(Arrays.asList(processTimes)); 
		
		System.out.println("\n");
		
		// Test Print
		System.out.println("Process Array print out");
		for (int i = 0; i < numOfProcesses; i++) {
			System.out.print("|" + processTimes[i]);
		}
		
		// ArrayList test print
		System.out.println("\nProcess ArrayList Copy Confirmation");
	    for(int i = 0; i < numOfProcesses; i++){
	    	System.out.print("|" + processList.get(i));
	    }
	    
	    // Keep reducing the TIME_QUANTUM while the list still contains values
	    while(!processList.isEmpty())
	    {
	    	int i = 0;
			if(processList.get(i) == 0){
				processList.remove(i);	
				
				if(processList.isEmpty()){
					System.out.println("\nList Empty");
					break;
				}
			}else{
				Integer num = processList.get(i);
				num = num - TIME_QUANTUM;
				processList.set(i, num);
				// waitTimesCalc[i] = processList.get(i) - 1; // How to store each each Round Robin time quantum deduction on each iteration?
			}
			i++;
		} // end while
	}
}