package lecture9.assignment;

import java.util.Scanner;

public class SumOfArrays {

	static Scanner sc;
	static int size1;
	static int size2;

	public static int[] takeInput1() {

		sc = new Scanner(System.in);
		size1 = sc.nextInt();

		int arr1[] = new int[size1];

		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		return arr1;

	}

	public static int[] takeInput2() {

		size2 = sc.nextInt();

		int[] arr2 = new int[size2];

		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		return arr2;

	}

	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {

		int i = arr1.length-1;
		int j = arr2.length-1;
		int k = output.length-1;
		int remainder = 0;
		
		while(i>=0 || j>=0) {
			if(i>=0 && j>=0) {
				if(arr1[i]+arr2[j]+remainder > 9) {
					int sum = arr1[i]+arr2[j];
					int temp = sum%10;
					output[k] = temp+remainder;
					remainder = (arr1[i]+arr2[j])/10;
				}
				else {
					output[k] = arr1[i]+arr2[j]+remainder;
					remainder=0;
				}
				i--;
				j--;
				k--;
			}
			
			else {
				if(arr1[i]+remainder > 9) {
					int temp = (arr1[i]+remainder)%10;
					output[k] = temp;
					remainder = (arr1[i]+remainder)/10;
				}
				else {
					output[k] = arr1[i]+remainder;
					remainder=0;
				}
				i--;
				j--;
				k--;
			}
			
			if(k == 0) {
				if(remainder > 0) {
					output[k] = remainder;
				}
				else {
					output[k] = 0;
				}
			}
		}
		
		for(int c=0; c<output.length; c++) {
			System.out.print(output[c] + " ");
		}

	}

	public static void main(String[] args) {

		int arr1[] = takeInput1();
		int arr2[] = takeInput2();

		if(arr1.length > arr2.length) {
			int arr3[] = new int[arr1.length+1];
			sumOfTwoArrays(arr1, arr2, arr3);
		}
		else if(arr2.length >= arr1.length) {
			int arr3[] = new int[arr2.length+1];
			sumOfTwoArrays(arr1, arr2, arr3);
		}
		else {
			int arr3[] = new int[arr2.length];
			sumOfTwoArrays(arr1, arr2, arr3);
		}

	}

}
