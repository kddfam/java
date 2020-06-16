package lecture4;

import java.util.Scanner;

public class CharacterPattern {
	
	static Scanner sc;
	static int rows;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		for(int i=1; i<=rows; i++) {
			for(int j=0; j<i; j++) {
				System.out.print((char) ('@'+i+j));
			}
			System.out.println();
		}

	}

}
