package lecture8;

import java.util.Scanner;

public class SwapAlternate {

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

	public static void swapAlternate(int[] arr) {

		for(int i=0; i<arr.length-1; i=i+2) {

			int temp = 0;
			temp = arr[i];
			arr[i] = arr[i+1]; 
			arr[i+1] = temp; 
		}
	}

	public static void main(String[] args) {

		int[] arr = takeInput();
		swapAlternate(arr);

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
