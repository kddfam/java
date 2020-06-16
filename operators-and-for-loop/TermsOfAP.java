package lecture6.assignment;

import java.util.Scanner;

public class TermsOfAP {
	
	static Scanner sc;
	static int number;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		int count = 0;
		for(int i=1; i<=number+count; i++) {
			int calculatedValue = 3*i+2;
			if(calculatedValue%4 == 0) {
				count++;
				continue;
			}
			else {
				System.out.println(calculatedValue);
			}
		}

	}

}
