package dated_2022_06_01;

import java.util.Scanner;

public class Q26_Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number upto which fibonacci wanted: ");
		int nFib = sc.nextInt();
		int prevFib = 1;
		int currFib = 1;
		int swapTemp;
		if (nFib == 1) {
				System.out.print(prevFib);
				
		} else if(nFib > 1) {
			System.out.print(prevFib + " " + currFib + " ");
			for (int i = 2; i < nFib; i++) {
				swapTemp = currFib;
				currFib += prevFib;
				prevFib = swapTemp;
				System.out.print(currFib + " ");
			}
		}
	}

}
