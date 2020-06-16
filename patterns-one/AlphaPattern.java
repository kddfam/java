package lecture4;

import java.util.Scanner;

public class AlphaPattern {
	
	static Scanner sc;
	static int rows;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		char start = '@';
		for(int i=1; i<=rows; i++) {
			for(int j=0; j<i; j++) {
				char toPrint = (char) (start+i);
				System.out.print(toPrint);
			}
			System.out.println();
		}

	}

}
