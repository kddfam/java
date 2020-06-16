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

		int start = 0; 
		int end = arr.length - 1; 
		int mid = 0, temp = 0; 
		while (mid <= end) { 
			switch (arr[mid]) { 
			case 0: { 
				temp = arr[start]; 
				arr[start] = arr[mid]; 
				arr[mid] = temp; 
				start++; 
				mid++; 
				break; 
			} 
			case 1: 
				mid++; 
				break; 
			case 2: 
				temp = arr[mid]; 
				arr[mid] = arr[end]; 
				arr[end] = temp; 
				end--; 
				break; 
			
			} 
		} 

	}

	public static void main(String[] args) {

		int arr[] = takeInput();
		sortZeroesAndOne(arr);

	}
}
