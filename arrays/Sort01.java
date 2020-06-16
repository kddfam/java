package lecture8.assignment;

import java.util.Scanner;

public class Sort01 {
	
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
	
	public static void sortZeroesAndOne(int[] arr) {
        
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				count++;
			}			
		}
		
		for(int i=0; i<count; i++) {
			arr[i] = 0;
		}
		
		for(int i=count; i<arr.length; i++) {
			arr[i] = 1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

    }

	public static void main(String[] args) {
		
		int arr[] = takeInput();
		sortZeroesAndOne(arr);

	}

}
