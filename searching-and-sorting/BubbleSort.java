package lecture9;

import java.util.Scanner;

public class BubbleSort {

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

	public static void bubbleSort(int[] arr){ //7
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}		
		}

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	} 

	public static void main(String[] args) {

		int[] arr = takeInput();
		bubbleSort(arr);

	}

}
