package patterns;

import java.util.Scanner;

public class PatternTwentyOne {
	
	static Scanner sc;
	static int number;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				if(j%2==0) {
					int num = 0;
					System.out.print(num);
				}
				else {
					int num = 1;
					System.out.print(num);
				}
			}
			System.out.println();
		}

	}

}
