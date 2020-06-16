package lecture6.assignment;

import java.util.Scanner;

public class SquareRoot {

	static Scanner sc;
	static int number;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
//		System.out.println((int) Math.sqrt(number));
		
		int n = 1;
		while(true) {
			if(n*n<number) {
				n++;
			}
			else {
				break;
			}
		}
		System.out.println(n);

	}

}
