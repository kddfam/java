package lecture8.assignment;

import java.util.Scanner;

public class PairSum {
	
	static Scanner sc;
	static int size;
	static int sumToFind;
	
	 public static void pairSum(int arr[], int x) {
	        
	        int count = 0;
	        for(int i=0; i<arr.length; i++) {
	            for(int j=i+1; j<arr.length; j++) {
	                if(arr[i]+arr[j] == x) {
	                	System.out.println(arr[i]+" "+arr[j]);
	                    count++;
	                }
	            }
	        }
	        
	        System.out.print(count);

	    }

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sumToFind = sc.nextInt();
		
		pairSum(arr, sumToFind);

	}

}
