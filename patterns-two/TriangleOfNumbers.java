package lecture5;

import java.util.Scanner;

public class TriangleOfNumbers {
	
	static Scanner sc;
	static int number;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		number = sc.nextInt();
		
       int k = 0, count = 0, count1 = 0;

        for(int i = 1; i <= number; ++i) {
            for(int space = 1; space <= number - i; ++space) {
                System.out.print(" ");
                ++count;
            }

            while(k != 2 * i - 1) {
                if (count <= number - 1) {
                    System.out.print((i + k));
                    ++count;
                }
                else {
                    ++count1;
                    System.out.print((i + k - 2 * count1));
                }

                ++k;
            }
            count1 = count = k = 0;

            System.out.println();
        }
    }

}
