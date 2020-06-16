package lecture4;

import java.util.Scanner;

public class ReverseNumberPattern {
	
	static Scanner sc;
	static int rows;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		for(int i=1; i<=rows; i++) {
			for(int j=i; j>0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
