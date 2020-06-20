package lecture10.assignment;

import java.util.Scanner;

public class HighestOccuringCharacter {

	static Scanner sc;
	static String inputString;
	static final int size = 256; 

	public static char highestOccuringCharacter(String inputString) {
		
        int count[] = new int[size];  
        int len = inputString.length(); 
        for (int i=0; i<len; i++) 
            count[inputString.charAt(i)]++; 
       
        int max = -1; 
        char result = ' ';
       
        for (int i = 0; i < len; i++) { 
            if (max < count[inputString.charAt(i)]) { 
                max = count[inputString.charAt(i)]; 
                result = inputString.charAt(i); 
            } 
        } 
       
        return result;
	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		inputString = sc.next();

		char result = highestOccuringCharacter(inputString);
		System.out.println(result);

	}

}
