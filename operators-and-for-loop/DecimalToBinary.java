package lecture6.assignment;

import java.util.Scanner;

public class DecimalToBinary {

	static Scanner sc;
	static int decimal;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		decimal = sc.nextInt();

		if(decimal == 0) {
			System.out.println("0");
		}
		else {

			int binary[] = new int[40];    
			int index = 0;    
			while(decimal > 0){    
				binary[index++] = decimal%2;    
				decimal = decimal/2;    
			}    
			for(int i = index-1;i >= 0;i--){    
				System.out.print(binary[i]);    
			} 

		}   
	}
}
