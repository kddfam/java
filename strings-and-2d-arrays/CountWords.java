package lecture10;

import java.util.Scanner;

public class CountWords {
	
	static Scanner sc;
	static String str;
	
	public static int countWords(String str){
		int count = 0;
		
		char ch[]= new char[str.length()];     
        for(int i=0;i<str.length();i++)  
        {  
            ch[i]= str.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        } 
		
		return count;

	}

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		str = sc.nextLine();
		
		int count = countWords(str);
		System.out.println(count);

	}

}
