package lecture10.assignment;

import java.util.Scanner;

public class RemoveCharacter {
	
	static Scanner sc;
	static String inputString;
	static String charToRemove;
	
	public static String removeCharacter(String inputString, char c) {
		
		String res = "";
		for(int i=0; i<inputString.length(); i++) {
			
			if(inputString.charAt(i) != c) {
				res += inputString.charAt(i);
			}
			
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		inputString = sc.nextLine();
		charToRemove = sc.next();
		
		char toRemove = charToRemove.charAt(0);
		
		String res = removeCharacter(inputString, toRemove);
		System.out.println(res);

	}

}
