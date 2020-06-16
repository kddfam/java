package lecture4;

import java.util.Scanner;

public class InterestingAlphabets {
	
	static Scanner sc;
	static int rows;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		char p = (char) ('A'+rows-1);
		for(int i=0; i<=rows-1; i++) {
			for(int j=i; j>=0; j--) {
				char toPrint = (char)(p-j);
				System.out.print(toPrint);
			}
			System.out.println();
		}

	}

}
