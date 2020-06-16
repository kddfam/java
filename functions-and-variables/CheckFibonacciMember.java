package lecture7;

import java.util.Scanner;

public class CheckFibonacciMember {
	
	static Scanner sc;
	static int number;
	
	public static boolean checkMember(int n){
		
		int first = 0;
		int second = 1;
		int third = 0;
		int temp = 1;
		
		if(n == 1 || n == 2) {
			System.out.println("1");
		}
		else {
			while(temp < n) {
				third = first+second;
				first = second;
				second = third;
				temp++;
			}
			System.out.print(third);
		}
		
		if(third == n) {
			return true;
		}
		else {
			return false;
		}

	}

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		boolean result = checkMember(number);
		if(result == true) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
