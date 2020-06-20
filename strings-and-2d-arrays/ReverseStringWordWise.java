package lecture10;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseStringWordWise {
	
	static Scanner sc;
	static String input;
	
	public static String reverseWordWise(String input) {
		
		Pattern pattern = Pattern.compile("\\s"); 
		  
        String[] temp = pattern.split(input); 
        String result = ""; 
 
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        
        return result; 
	}

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		input = sc.nextLine();
		
		String result = reverseWordWise(input);
		System.out.println(result);

	}

}
