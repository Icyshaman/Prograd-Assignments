package dated_2022_05_31;

import java.util.Scanner;

public class Q7_InsuranceChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please type your gender(M/F): ");
		String gender = sc.next().toLowerCase();
		boolean isMale = (gender.equals("m")) ? true : false;
		System.out.print("Are you Married(yes/no): ");
		String marital_status = sc.next().toLowerCase();
		boolean isMarried = (marital_status.equals("yes")) ? true : false;
		System.out.print("Please enter your age: ");
		short age = sc.nextShort();
		boolean isInsured = false;
		if (isMarried) {
			isInsured = true;
		} else if (isMale && (age > 30)) {
			isInsured = true;
		} else if (!isMale && (age > 25)) {
			isInsured = true;
		}
		if (isInsured) {
			System.out.println("You're Insured");
		} else {
			System.out.println("You're not Insured");
		}
	}

}
