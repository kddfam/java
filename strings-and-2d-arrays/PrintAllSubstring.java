package lecture10;

import java.util.Scanner;

public class PrintAllSubstring {
	
	static Scanner sc;
	static String str;
	
	public static void printSubstrings(String str){

		for (int len = 1; len <= str.length(); len++) { 
            for (int i = 0; i <= str.length() - len; i++) { 
                //  Print characters from current 
                // starting point to current ending 
                // point.   
                int j = i + len - 1; 
                for (int k = i; k <= j; k++) { 
                    
                } 
  
                System.out.println(); 
            } 
        } 
		
	}

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		str = sc.next();
		
		printSubstrings(str);

	}

}
