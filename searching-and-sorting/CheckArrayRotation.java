package lecture9.assignment;

import java.util.Scanner;

public class CheckArrayRotation {

	static Scanner sc;
	static int size;
	
	public static int[] takeInput() {

		sc = new Scanner(System.in);
		size = sc.nextInt();

		int arr1[] = new int[size];

		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		return arr1;

	}
	
	public static int arrayRotateCheck(int[] arr){
    	
		int i = arr.length-1;
		int j = i-1;
		int index = 0;
		
		while(i>0 && j>0) {
			if(arr[i] < arr[j]) {
				index = i;
				i--;
				j--;
				break;
			}
			else {
				i--;
				j--;
				continue;
			}
		}
		
		return index;
		
    }
	
	public static void main(String[] args) {
		
		int arr1[] = takeInput();
		int value = arrayRotateCheck(arr1);
		System.out.println(value);

	}

}
