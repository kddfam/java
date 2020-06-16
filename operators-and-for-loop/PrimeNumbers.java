package lecture6;

import java.util.Scanner;

public class PrimeNumbers {

	static Scanner sc;
	static int number;

	public static void main (String[] args) {		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
		int i =0;
		int num =0;
		String  primeNumbers = "";

		for (i = 1; i <= number; i++) { 		  	  
			int counter=0; 	  
			for(num =i; num>=1; num--) {
				if(i%num==0) {
					counter = counter + 1;
				}
			}
			if (counter ==2) {
				System.out.println(primeNumbers + i + " ");
			}	
		}	
		
	}

}
