package lecture9.assignment;

import java.util.Scanner;

public class RotateArray {

	static Scanner sc;
	static int size;
	static int d;

	public static int[] takeInput() {

		sc = new Scanner(System.in);
		size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		d = sc.nextInt();

		return arr;

	}

	public static void rotate(int[] arr, int d) {
		
		// SOLUTION ONE

//		int i=d;
//		int j=0;
//		int[] arr1 = new int[arr.length];
//
//		while(i<arr.length && j<arr1.length-2) {
//
//			arr1[j] = arr[i];
//			i++;
//			j++;
//
//		}
//
//		int k=0;
//		int l=j;
//		while(k<d && l<arr1.length) {
//
//			arr1[l] = arr[k];
//			l++;
//			k++;
//
//		}
//		
//		for(int a=0; a<arr1.length; a++) {
//			arr[a] = arr1[a];
//		}
//		
//		for(int a=0; a<arr.length; a++) {
//			System.out.print(arr[a]+ " ");
//		}
		
		// SOLUTION TWO
		
		int arr1[] = new int[arr.length];
		int sI = 0;
		for(int i=d; i<arr.length; i++) {
			arr1[sI] = arr[i];
			sI++;
		}
		for(int i=0; i<d; i++) {
			arr1[sI] = arr[i];
			sI++;
		}
		
		for(int i=0; i<arr1.length; i++) {
			arr[i] = arr1[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void main(String args[]) {
		
		int arr[] = takeInput();
		rotate(arr, d);
		
		
	}

}
