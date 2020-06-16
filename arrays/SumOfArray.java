package lecture8;

import java.util.Scanner;

public class SumOfArray {
	
	static Scanner sc;
	static int size;
	
	public static int[] takeInput() {
		
		sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
		
	}
	
	public static int sum(int[] arr) {
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		int arr[] = takeInput();
		int sum = sum(arr);
		System.out.println(sum);

	}

}
