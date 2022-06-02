package dated_2022_06_01;

import java.util.Scanner;

public class Q20_LeapYearVerification {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		short year = sc.nextShort();
		boolean flag;
		if (year % 400 == 0) {
			flag = true;
		} else if (year % 100 == 0) {
			flag = false;
		} else if (year % 4 == 0) {
			flag = true;
		} else {
			flag = false;
		}
		if (flag) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a leap year");
		}
	}
}
