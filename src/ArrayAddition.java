
import java.util.stream.*;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a double array to be sum
		int[] addition1= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 };
		//Calling the method to  sum the array method to created later
//		double sum =calculateSum(addition1);
		// print the result of sum.
//		System.out.println("Sum of the array is here:" + sum);
	
//		System.out.println("First element of arrays is :"+ addition1[0]);
//		System.out.println("Second element of array is " + addition1[1]);
//		System.out.println("First element of arrays is :"+ addition1[2]);
//		System.out.println("First element of arrays is :"+ addition1[3]);
//		System.out.println(calculateSum());
		
//		for(int j=0; j<14;j++) {
////			System.out.println(" The  Addition of full array is "+ )
//			double plus1 = addtition1[i]+addition1[i+1];
//			System.out.println(plus1);
		int[] addition2= {5,6,9,8,2,7,11,54,56,35,42,88};
//			
//		}	
int sum=calculateSum(addition1);
		
			System.out.println("Sum of the array is :"+ sum);
		
		
		
//		
//		for (int i=0; i<14; i++ ) {
//			System.out.println(" The " + addition1[i] + " number is " + addition1[i]);		
//			System.out.println("While");
//			System.out.println("The Addition of "+ addition1[i] + "and " +addition1[i+(i+1)]+" is  " + addition1[i]+ (addition1[i]+1));
//				}
//
		
		
		
		}

	//Create a calculateSum() here
	private static int calculateSum(int[] array) {
		// defining the method to calculate sum 
		//double calculateSum[] {
			//double calculateSum(stream)
//	system.out.	

//			for (int i=0; i<14; i++ ) {
//				System.out.println(" The " + addition1[i] + " is " + addition1[i]);
//				
//					}
			
//	for(int j=0; j<14;j++) {
//		System.out.println(" The  Addition of full array is "+ )
//		double plus1 = addtition1[i]+addition1[i+1];
//		System.out.println(plus1);
		
		
		
//	}	
	
		
		// Initialize a variable to store the sum
	    int sum = 0;

	    // Use a loop to iterate through the array and add each element to the sum
	    for (int num : array) {
	        sum += num;
	    }
	
		return sum;
	
	}
		
		
		
	}
	
