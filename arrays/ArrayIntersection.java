package lecture8.assignment;

import java.util.Scanner;

public class ArrayIntersection {
	
	static Scanner sc;
	static int size1;
	static int size2;
	
	public static void intersections(int[] input1, int[] input2){
		
		for(int i=0; i<input1.length; i++) {
			for(int j=0; j<input2.length; j++) {
				if(input1[i] == input2[j]) {
					input2[j] = Integer.MIN_VALUE;
					System.out.print(input1[i]+" ");
					break;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		size1 = sc.nextInt();

		int arr[] = new int[size1];

		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		size2 = sc.nextInt();
		int arr1[] = new int[size2];

		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		intersections(arr, arr1);

	}

}
