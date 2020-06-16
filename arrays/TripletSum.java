package lecture8.assignment;

import java.util.Scanner;

public class TripletSum {
	
	static Scanner sc;
	static int size;
	static int sumToFind;
	
	 public static void tripletSum(int arr[], int x) {
	        
	        int count = 0;
	        for(int i=0; i<arr.length; i++) {
	            for(int j=i+1; j<arr.length; j++) {
	            	for(int k=j+1; k<arr.length; k++) {
	            		if(arr[i]+arr[j]+arr[k] == x) {
		                	System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
		                    count++;
		                }
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
		
		tripletSum(arr, sumToFind);

	}

}
