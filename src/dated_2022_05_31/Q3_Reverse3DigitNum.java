package dated_2022_05_31;

import java.util.Scanner;

public class Q3_Reverse3DigitNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 digit number: ");
		int num = sc.nextInt();
		int result = 0;
		result += (num % 10) * 100;
		num /= 10;
		result += (num % 10) * 10;
		num /= 10;
		result += (num % 10); 
		System.out.println(result);
	}
}
