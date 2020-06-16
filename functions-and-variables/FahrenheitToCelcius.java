package lecture7;

import java.util.Scanner;

public class FahrenheitToCelcius {

	static Scanner sc;
	static int s,e,w;
	
	public static void printFahrenheitTable(int start, int end, int step) {
		
		for(int i=start; i<=end; i=i+step) {
			int c = (i-32)*5/9;
			System.out.println(i+" "+c);
		}
		
	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		s = sc.nextInt();
		e = sc.nextInt();
		w = sc.nextInt();
		
		printFahrenheitTable(s, e, w);

	}

}
