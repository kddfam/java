package lecture6.assignment;

import java.util.Scanner;

public class CheckNumberSequence {

	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		int arr[] = new int[100];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int prev=0;
		int curr=0;
		for(int i=0; i<arr.length; i++) {
			prev = arr[i];
			curr = arr[i+1];
			if(prev < curr) {
				System.out.print(true);
			}
			else {
				System.out.print(false);
			}
		}
		
		
	}

}
