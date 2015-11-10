package ie.gmit.sw;
import java.util.Scanner;


public class Runner{

	public static void main(String[] args) {
		
		// Prompt user to enter a total number of processes
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of processes: ");
		
		// Variable / Array Declarations
		int sum = 0;
		double sumWaitTimes = 0;
		double averageWaitTime = 0;
		int numOfProcesses = input.nextInt();
		int[] processTimes = new int[numOfProcesses];
		int[] waitTime = new int[processTimes.length];
		
		
		// User prompted to enter the burst size of each process, which is then stored in the array processTimes[]
		for(int i = 0; i < numOfProcesses; i++){
			System.out.println("Please enter the burst time for each process: ");
			processTimes[i] = input.nextInt();
		}
		
		
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
		
		
		System.out.println("\nWait time array:");
		// Displays values for each processes waitTimes
		for(int i: waitTime){
			System.out.print("|" + i);
		}
		
		averageWaitTime = sumWaitTimes / waitTime.length;
		System.out.println("\n\nTotal average Wait ime value is: " + averageWaitTime);
	
		
		
		
/*		System.out.println("Please enter:\n1 for FCFS\n2 for SJF\n3 for Round Robin");
		
		int choice = input.nextInt();
		switch(choice){
			case 1:
				System.out.println("FCFS");
				break;
			case 2:
				System.out.println("SJF");
				break;
			case 3:
				System.out.println("Round Robin");
				break;
			default:
				System.out.println("Please Enter a valid selection");
				break;
		}*/
		
		input.close();
	}
}