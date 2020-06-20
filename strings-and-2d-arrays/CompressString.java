package lecture10.assignment;

import java.util.Scanner;

public class CompressString {
	
	static Scanner sc;
	static String input;
	
	public static String compress(String inputString) {
		
		String result = "";
		
		for (int i = 0; i < inputString.length(); i++) {  
            int count = 1; 
            while (i < inputString.length() - 1 && inputString.charAt(i) == inputString.charAt(i + 1)) { 
                count++; 
                i++; 
            }
            if(count == 1) {
            	result = result+inputString.charAt(i);
			}
			else {
				result = result+inputString.charAt(i)+count;
			}
        } 
		
//		char[] ch = new char[inputString.length()];
//		for(int i=0; i<ch.length; i++) {
//			ch[i] = inputString.charAt(i);
//		}
//		
//		for(int i=0; i<ch.length; i++) {
//			int count = 0;
//			for(int j=i+1; j<ch.length; j++) {
//				if(ch[i] == ch[j]) {
//					count++;
//					continue;
//				}
//				else {
//					break;
//				}
//			}
//			if(count == 1) {
//				result = result+ch[i];
//			}
//			else {
//				result = result+ch[i]+count;
//			}
//		}
		
		return result;

	}

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		input = sc.next();
		
		String result = compress(input);
		System.out.println(result);

	}

}
