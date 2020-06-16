package lecture8;

import java.util.Scanner;

public class LinearSearch {
	
	static Scanner sc;
	static int size;
	static int elementToSearch;
	
	public static int[] takeInput() {
		
		sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		elementToSearch = sc.nextInt();
		
		return arr;
		
		
	}
	
	public static int linearSearch(int[] arr, int val) {
		
		int index = -1;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == val) {
				index = i;
				return index;
			}
		}
		
		return index;
		
	}

	public static void main(String[] args) {
		
		int arr[] = takeInput();
		int performSearch = linearSearch(arr, elementToSearch);
		
		System.out.println(performSearch);

	}

}
