package lecture10.assignment;

import java.util.Scanner;

public class ReverseEachWord {
	
	static Scanner sc;
	static String input;
	
	public static String reverseEachWord(String input) {
		
		String words[]=input.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    String res = reverseWord.trim();
	    return res; 

	}

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		input =  sc.nextLine();
		
		String res = reverseEachWord(input);
		System.out.println(res);
	}

}
