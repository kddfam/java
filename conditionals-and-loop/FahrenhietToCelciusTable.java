package lecture3;

import java.util.Scanner;

public class FahrenhietToCelciusTable {
	
	static Scanner sc;
	static int s,e,w;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		s = sc.nextInt();
		e = sc.nextInt();
		w = sc.nextInt();
		
		for(int i=s; i<=e; i=i+w) {
			int c = (i-32)*5/9;
			System.out.println(i+" "+c);
		}

	}

}
