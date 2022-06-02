package dated_2022_05_31;

import java.util.Scanner;

public class Q4_SumOfFirstDigitAndLastDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 4 digit Number: ");
		int num = sc.nextInt();
		int sum = 0;
		sum = (num/1000)+(num % 10);
		System.out.println(sum);
	}

}
