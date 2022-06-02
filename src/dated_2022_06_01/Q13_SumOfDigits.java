package dated_2022_06_01;

import java.util.Scanner;

public class Q13_SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		String[] digitArray = Integer.toString(num).split("");
		int sum = 0;
		for(String digit: digitArray) {
			sum += Integer.parseInt(digit);
		}
		System.out.println("Sum of digits is: " + sum);
	}

}
