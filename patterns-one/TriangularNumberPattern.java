package lecture4;

import java.util.Scanner;

public class TriangularNumberPattern {

	static Scanner sc;
	static int rows;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
