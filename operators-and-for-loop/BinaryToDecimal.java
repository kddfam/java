package lecture6.assignment;

import java.util.Scanner;

public class BinaryToDecimal {
	
	static Scanner sc;
	static int binary;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		binary  = sc.nextInt();
		int decimal = 0;
		int n = 0;
		
		while(true) {
			if(binary == 0) {
				break;
			}
			else {
				int temp = binary%10;
				decimal += temp*Math.pow(2, n);
				binary /= 10;
				n++;
			}
		}
		System.out.println(decimal);

	}

}
