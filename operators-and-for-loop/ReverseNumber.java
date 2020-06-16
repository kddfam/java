package lecture6.assignment;

import java.util.Scanner;

public class ReverseNumber {
	
	static Scanner sc;
	static int number;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		int reverse=0;
		while(number != 0) {
			int temp = number%10;
			number /= 10;
			if(temp>0) {
				reverse = reverse*10+temp;
			}
			else {
				continue;
			}
		}
		System.out.print(reverse);

	}

}
