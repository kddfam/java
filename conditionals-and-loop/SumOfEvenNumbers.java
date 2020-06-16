package lecture3;

import java.util.Scanner;

public class SumOfEvenNumbers {
	
	static Scanner sc;
	static int number;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=number; i++) {
			
			if(i%2==0) {
				sum = sum+i;
			}
			else {
				continue;
			}
			
		}
		System.out.println(sum);

	}

}
