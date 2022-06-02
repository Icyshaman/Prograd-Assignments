package dated_2022_05_31;

import java.util.Scanner;

public class Q10_DaysToMonths {

	public static void main(String[] args) {
		System.out.print("Enter num of days: ");
		Scanner sc = new Scanner(System.in);
		int numOfDays = sc.nextInt();
		int months = numOfDays/30;
		int remainingDays = numOfDays%30;
		System.out.println(numOfDays + " = " + months + " Months and " + remainingDays + " Days");
	}

}
