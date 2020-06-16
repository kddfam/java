package lecture3.assignment;

import java.util.Scanner;

public class TotalSalary {
	
	static Scanner sc;
	static int basicSalary;
	static char nameInitial;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		basicSalary = sc.nextInt();
		String str = sc.next();
		nameInitial = str.toUpperCase().charAt(0);
		
		double hra = 0.20*basicSalary;
		double da = 0.50*basicSalary;
		int allowance = 1300;
		double pf = 0.11*basicSalary;
		int totalSalary=0;
		
		if(nameInitial == 'A') {
			allowance = 1700;
			totalSalary = (int) ((int) Math.round(basicSalary+hra+da+allowance-pf));
		}
		else if(nameInitial == 'B') {
			allowance = 1500;
			totalSalary = (int) ((int) Math.round(basicSalary+hra+da+allowance-pf));
		}
		else {
			totalSalary = (int) ((int) Math.round(basicSalary+hra+da+allowance-pf));
		}
		
		System.out.print(totalSalary);

	}

}
