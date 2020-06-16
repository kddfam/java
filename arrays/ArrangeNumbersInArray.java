package lecture8;

import java.util.Scanner;

public class ArrangeNumbersInArray {
	
	static Scanner sc;
	static int size;
	
	public static void arrange(int[] arr, int n) {
		
		int s = 0;
		int e = n-1;
		int value = 1;
		
		while(s<=e) {
			if(value%2 == 0) {
				arr[e] = value;
				e--;
				value++;
			}
			else {
				arr[s] =value;
				s++;
				value++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
    }

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int arr[] = new int[size];
	
		arrange(arr, size);

	}

}
