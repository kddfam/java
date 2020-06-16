package lecture9;

import java.util.Scanner;

public class BinarySearch {

	static Scanner sc;
	static int size;
	static int elementToSearch;

	public static int[] takeInput() {

		sc = new Scanner(System.in);
		size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		elementToSearch = sc.nextInt();

		return arr;

	}

	public static int binarySearch(int[] arr, int x) {

		int start = 0;
		int end = arr.length;

		while (start < end) {
			int mid = (start+end)/2;

			if(arr[mid] == x) {
				return mid;
			}
			else if(arr[mid] < x) {
				start = mid+1;
				mid = (start+end)/2;
			}
			else {
				end = mid-1;
				mid = (start+end)/2;
			}
		}

		return -1;

	}

	public static void main(String[] args) {

		int[] arr = takeInput();
		int performSearch = binarySearch(arr, elementToSearch);
		System.out.println(performSearch);

	}

}
