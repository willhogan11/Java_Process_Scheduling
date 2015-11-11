package ie.gmit.sw;
import java.util.Arrays;
import java.util.Scanner;


public class Runner{

	public static void main(String[] args) {
		
		// Prompt user to enter a total number of processes
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of processes: ");
		
		// Variable / Array Declarations used by all methods
		int sum = 0;
		double sumWaitTimes = 0;
		double averageWaitTime = 0;
		int numOfProcesses = input.nextInt();
		int[] processTimes = new int[numOfProcesses];
		int[] waitTime = new int[processTimes.length];
		
		// final int TIME_QUANTUM = 4;
		
		
		// User prompted to enter the burst size of each process, which is then stored in the array processTimes[]
		for(int i = 0; i < numOfProcesses; i++){
			System.out.println("Please enter the burst time for each process: ");
			processTimes[i] = input.nextInt();
		}
		
		
		
	
		
		// Choose the Process Scheduling Algorithm
		System.out.println("Please enter a Process Scheduling Algorithm:\n1 for FCFS\n2 for SJF\n3 for Round Robin\n4 to Exit the Program");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
				firstComeFirstServed(waitTime, processTimes, sum, sumWaitTimes, averageWaitTime);
				break;
			case 2:
				shortestJobFirst(waitTime, processTimes, sum, sumWaitTimes, averageWaitTime);
				break;
			case 3:
				System.out.println("Round Robin");
				break;
			case 4:
				System.out.println("Program Finished...");
				System.exit(0);
			default:
				System.out.println("Please Enter a valid selection");
				break;
		}
		
		input.close();
	}
	
	
	public static void firstComeFirstServed(int waitTime[], int processTimes[], int sum, double sumWaitTimes, double averageWaitTime){
		// Display list of each process and associated burst times
		System.out.println("Process Array:");
		for(int x: processTimes)
			System.out.print("|" + x);
		
		// Calculates the Wait time for each process and also calculates the sum of the waitTime[] Array
		for(int i = 0; i < processTimes.length; i++){
			waitTime[i] = sum;
			sum = sum + processTimes[i];
			sumWaitTimes = sumWaitTimes + waitTime[i];
		}

		// Displays values for each processes waitTimes
		System.out.println("\nWait time array:");
		for(int i: waitTime){
			System.out.print("|" + i);
		}
		
		// Calculates the Average wait time for total processes
		averageWaitTime = sumWaitTimes / waitTime.length;
		System.out.println("\n\nTotal average Wait ime value is: " + averageWaitTime);
		
	} // End firstComeFirstServed
	
	
	
	public static void shortestJobFirst(int waitTime[], int processTimes[], int sum, double sumWaitTimes, double averageWaitTime){
		// Display list of each process and associated burst times
		System.out.println("Process Array:");
		Arrays.sort(processTimes); // Sorts the array for Shortest Job First
		for(int x: processTimes)
			System.out.print("|" + x);
		
		// Calculates the Wait time for each process and also calculates the sum of the waitTime[] Array
		for(int i = 0; i < processTimes.length; i++){
			waitTime[i] = sum;
			sum = sum + processTimes[i];
			sumWaitTimes = sumWaitTimes + waitTime[i];
		}

		// Displays values for each processes waitTimes
		System.out.println("\nWait time array:");
		for(int i: waitTime){
			System.out.print("|" + i);
		}
		
		// Calculates the Average wait time for total processes
		averageWaitTime = sumWaitTimes / waitTime.length;
		System.out.println("\n\nTotal average Wait ime value is: " + averageWaitTime);
		
	} // End shortestJobFirst
	
} // End class

