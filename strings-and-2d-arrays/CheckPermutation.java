package lecture10.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {
	
	static Scanner sc;
	static String input1;
	static String input2;
	
	public static boolean isPermutation(String input1, String input2) {
	   
	    int str1 = input1.length();  
	    int str2 = input2.length();  
	  
	    if (str1 != str2)  
	    return false;  
	    char ch1[] = input1.toCharArray(); 
	    char ch2[] = input2.toCharArray(); 
	  
	    Arrays.sort(ch1);  
	    Arrays.sort(ch2);  
	  
	    for (int i = 0; i < str1; i++)  
	    if (ch1[i] != ch2[i])  
	        return false;  
	  
	    return true; 

	}

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		input1 = sc.next();
		input2 = sc.next();
		
		boolean res = isPermutation(input1, input2);
		System.out.println(res);

	}

}
