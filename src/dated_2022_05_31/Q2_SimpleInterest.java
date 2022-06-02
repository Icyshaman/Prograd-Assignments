package dated_2022_05_31;

import java.util.Scanner;

public class Q2_SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float roi = 7.5f;
		System.out.print("Enter the time period (In Years): ");
		short time = sc.nextShort();
		System.out.print("Enter the principal amount: ");
		int pa = sc.nextInt();
		float si = (pa*roi*time)/100;
		System.out.println("Amount to be paid: "+ (pa + si));
	}

}
