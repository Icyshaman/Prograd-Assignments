package dated_2022_06_01;

import java.util.Scanner;

public class Q15_Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int factorial = 1;
		for(int i = 1; i<=num; i++) {
			factorial *= i;
		}
		System.out.println(factorial);

	}

}
