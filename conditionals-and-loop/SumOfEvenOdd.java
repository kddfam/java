package lecture3.assignment;

import java.util.Scanner;

public class SumOfEvenOdd {

	static Scanner sc;
	
	public static void main(String[] args) {
		
		int initialNumber;
		int evenSum=0, oddSum=0;
		
		sc = new Scanner(System.in);
		initialNumber = sc.nextInt();
		
		while(initialNumber != 0) {
			
			int numberToCheck = initialNumber%10;
			if((numberToCheck%2) == 0) {
				evenSum += numberToCheck;
			}
			else {
				oddSum += numberToCheck;
			}
			
			initialNumber /= 10;
		}
		
		System.out.println(evenSum+ " " +oddSum);
		
	}

}
