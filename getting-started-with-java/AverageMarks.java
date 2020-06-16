package lecture2;
import java.util.Scanner;

public class AverageMarks {
	
	static Scanner sc;
	static String nameInitial;
	static int marks1, marks2, marks3, avgMarks;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		nameInitial = sc.next();
		marks1 = sc.nextInt();
		marks2 = sc.nextInt();
		marks3 = sc.nextInt();
		
		avgMarks = (marks1+marks2+marks3)/3;
		System.out.println(nameInitial);
		System.out.println(avgMarks);
		
		System.out.println('a'+1);

	}

}
