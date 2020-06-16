package lecture6.assignment;

import java.util.Scanner;

public class SumOfProduct {
	
	static Scanner sc;
	static int choice;
	static int number;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		choice = sc.nextInt();
		
		int sum=0;
		int prod=1;
		
		if(choice == 1) {
			for(int i=1; i<=number; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
		else if(choice == 2) {
			for(int i=1; i<=number; i++) {
				prod *= i;
			}
			System.out.println(prod);
		}
		else {
			System.out.println("-1");
		}

	}

}
