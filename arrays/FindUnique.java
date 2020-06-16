package lecture8.assignment;

import java.util.Scanner;

public class FindUnique {

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

	public static int findUnique(int arr[]) {
		
        for(int i=0; i<arr.length; i++) {
            int j;
			for( j=0; j<arr.length; j++) {
                if(i!=j){
                    
                
					if(arr[i] == arr[j]) {
					break;
					}
                }   
            }
				if(j == arr.length) {
                    return arr[i];
				
			}
		}
    	return 0;

	}
	
	public static void main(String args[]) {
		
		int arr[] = takeInput();
		
		int number = findUnique(arr);
		
		System.out.println(number);
		
	}

}
