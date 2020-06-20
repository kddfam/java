package lecture10;

import java.util.Scanner;

public class LargestRowOrColumn {

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

	public static void findLargest(int mat[][]){
		int rows = mat.length;
		if(rows==0)
        {
            System.out.println("row "+rows +" "+ Integer.MIN_VALUE);
            return;
        }
		int cols = mat[0].length;
		int max = Integer.MIN_VALUE;
		int q = 0;
		String s = "";
		for(int i=0; i<rows; i++) {
			int sum=0;
			for(int j=0; j<cols; j++) {
				sum = sum + mat[i][j];
			}
			if(sum>max) {
				max = sum;
				q = i;
				s = "row";
			}
		}
		for(int i=0; i<cols; i++) {
			int sum=0;
			for(int j=0; j<rows; j++) {
				sum = sum + mat[j][i];
			}
			if(sum>max) {
				max = sum;
				q = i;
				s = "column";
			} 
		}
		System.out.println(s + " "  + q + " " + max);
	}

	public static void main(String[] args) {

		int mat[][] = takeInput();
		findLargest(mat);

	}

}
