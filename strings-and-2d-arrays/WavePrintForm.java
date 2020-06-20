package lecture10;

import java.util.Scanner;

public class WavePrintForm {

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
	
	public static void wavePrint(int mat[][]){
		System.out.println();
		int row = mat.length;
		if(row==0)
        {
            return;
        }
		int col = mat[0].length;
		for(int i=0;i<col;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<row;j++)
				{
					System.out.print(mat[j][i]+" ");
				}
			}
			else
			{
				for(int j=row-1;j>=0;j--)
				{
					System.out.print(mat[j][i]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int[][] mat = takeInput();
		wavePrint(mat);

	}

}
