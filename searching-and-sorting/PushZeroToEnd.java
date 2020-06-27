package lecture9.assignment;

import java.util.Scanner;

public class PushZeroToEnd {
	
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
	
	public static void pushZerosAtEnd(int[] arr) {
		
		// APPROACH ONE
		
//		int count = 0;
//		  
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                arr[count++] = arr[i];
//            }    
//        }    
//                                      
//        while (count < arr.length) {
//            arr[count++] = 0; 
//        }
		
		// APPROACH TWO
		
		int sI = 0;
		int eI = arr.length-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				arr[eI] = arr[i];
				eI--;
			}
			else {
				arr[sI] = arr[i];
				sI++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
    }

	public static void main(String[] args) {
		
		int arr[] = takeInput();
		pushZerosAtEnd(arr);

	}

}
