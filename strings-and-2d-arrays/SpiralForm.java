package lecture10;

import java.util.Scanner;

public class SpiralForm {
	
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

	public static void spiralPrint(int matrix[][]){

		int rows = matrix.length;
		if(rows==0)
        {
            return;
        }
		int cols = matrix[0].length;
		int i, k = 0, l = 0;

		while (k < rows && l < cols) { 
			for (i = l; i < cols; ++i) { 
				System.out.print(matrix[k][i] + " "); 
			} 
			k++; 
			
			for (i = k; i < rows; ++i) { 
				System.out.print(matrix[i][cols - 1] + " "); 
			} 
			cols--; 

			if (k < rows) { 
				for (i = cols - 1; i >= l; --i) { 
					System.out.print(matrix[rows - 1][i] + " "); 
				} 
				rows--; 
			} 

			if (l < cols) { 
				for (i = rows - 1; i >= k; --i) { 
					System.out.print(matrix[i][l] + " "); 
				} 
				l++; 
			} 
		} 

	}

public static void main(String[] args) {
		
		int[][] mat = takeInput();
		spiralPrint(mat);

	}

}
