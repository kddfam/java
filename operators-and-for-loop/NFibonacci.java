package lecture6;

import java.util.Scanner;

public class NFibonacci {
	
	static Scanner sc;
	static int number;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		int first = 0;
		int second = 1;
		int third = 0;
		int temp = 1;
		
		if(number == 1 || number == 2) {
			System.out.println("1");
		}
		else {
			while(temp < number) {
				third = first+second;
				first = second;
				second = third;
				temp++;
			}
			System.out.print(third);
		}

	}

}
