package lecture9.assignment;

import java.util.Scanner;

public class Sort012 {
	static Scanner sc;
	static int size;

	public static int[] takeInput() {

		sc = new Scanner(System.in);
		size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		return arr;

	}

	public static void sortZeroesAndOne(int[] arr) {
		
		// SOLUTION ONE

//		int start = 0; 
//		int end = arr.length - 1; 
//		int mid = 0, temp = 0; 
//		while (mid <= end) { 
//			switch (arr[mid]) { 
//			case 0: { 
//				temp = arr[start]; 
//				arr[start] = arr[mid]; 
//				arr[mid] = temp; 
//				start++; 
//				mid++; 
//				break; 
//			} 
//			case 1: 
//				mid++; 
//				break; 
//			case 2: 
//				temp = arr[mid]; 
//				arr[mid] = arr[end]; 
//				arr[end] = temp; 
//				end--; 
//				break; 
//			
//			} 
//		} 
		
		// SOLUTION TWO
		
		int count0, count1, count2;
		count0=count1=count2=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 2) {
				count2++;
			}
			else if(arr[i] == 1) {
				count1++;
			}
			else if(arr[i] == 0) {
				count0++;
			}
		}
		
		for(int i=0; i<arr.length-count2-count1; i++) {
			arr[i]=0;
		}
		for(int i=count0; i<arr.length-count2; i++) {
			arr[i]=1;
		}
		for(int i=arr.length-count2; i<arr.length; i++) {
			arr[i]=2;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void main(String[] args) {

		int arr[] = takeInput();
		sortZeroesAndOne(arr);

	}
}
