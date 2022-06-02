package dated_2022_05_31;

import java.util.Scanner;

public class Q8_GreaterOf3Nums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("Enter 1st number: ");
		num1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		num2 = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		num3 = sc.nextInt();
		int greatest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
		System.out.println("Greatest Number is: " + greatest);
	}

}
