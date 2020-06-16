package lecture3.assignment;

import java.util.Scanner;

public class PowerOfNumber {

	static Scanner sc;

	public static void main(String[] args) {

		int number, power;
		long result = 1;
		sc = new Scanner(System.in);
		number = sc.nextInt();
		power = sc.nextInt();

		while (power != 0) {
			result *= number;
			power--;
		}

		System.out.println(result);
	}

}
