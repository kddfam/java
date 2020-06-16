package lecture8.assignment;

import java.util.Scanner;

public class FindDuplicate {
	
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
	
	public static int duplicateNumber(int arr[]) {
        
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					temp = arr[i];
				}
			}
		}
		
		return temp;

    }

	public static void main(String[] args) {
		
		int arr[] = takeInput();
		int value = duplicateNumber(arr);
		System.out.println(value);
		

	}

}
