package practise;
import java.util.*;
public class Prefixsum_1D {
	
	public static void printArray(int[] arr) {
		
	}
	
	
	
	
	
	public static void main (String[] args ) {
		System.out.print("Enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter " + n + " elements ");
		
		for ( int i = 0 ; i < n ; i ++) {
			
			arr[ i ] = sc.nextInt();
		}
		
	}

}
