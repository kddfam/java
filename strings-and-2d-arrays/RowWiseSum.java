package lecture10;

import java.util.Scanner;

public class RowWiseSum {
	
	static Scanner sc;
	static int rows;
	static int cols;
	
	public static int[][] takeInput() {
		
		sc = new Scanner(System.in);
		rows = sc.nextInt();
		cols = sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		return arr;
		
	}
	
	public static void rowWiseSum(int[][] mat) {
		for(int i=0; i<mat.length; i++) {
			int sum = 0;
			for(int j=0; j<mat[0].length; j++) {
				int value = mat[i][j];
				sum += value;
			}
			System.out.print(sum+" ");
		}
	}
	
	public static void main(String args[]) {
		
		int[][] arr = takeInput();
		rowWiseSum(arr);
		
	}

}
