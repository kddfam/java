package lecture3;

import java.util.Scanner;

public class CharacterCase {
	
	static Scanner sc;
	static char value;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		String str = sc.next();
		value = str.charAt(0);
		
		if(value >= 'A' && value <='Z') {
			System.out.println("1");
		}
		else if(value >= 'a' && value <= 'z') {
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}

	}

}
