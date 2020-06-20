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
		int arrIndex = 1;
		boolean flag = false;
		
		int fib[] = new int[n];
		
		if(n == 0) {
			return true;
		}
		else if(n == 1) {
			return true;
		}
		else {
			while(temp < n) {
				third = first+second;
				fib[arrIndex] = third;
				first = second;
				second = third;
				temp++;
				arrIndex++;
			}
		}
		
		for(int i=0; i<fib.length; i++) {
			if(fib[i] == n) {
				return true;
			}
		}
		
		return flag;

	}

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		System.out.println(checkMember(number));

	}

}
