package dated_2022_05_31;

import java.util.Scanner;

public class Q6_GrossSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the basic salary: ");
		int basic = sc.nextInt();
		float ta, da, hra, pf, bonus, gross;
		ta = basic * 0.1f;
		da = basic * 0.15f;
		hra = basic * 0.2f;
		pf = basic * 0.12f;
		if (basic >= 20000) {
			bonus = basic * 0.1f;
		} else {
			bonus = basic * 0.2f;
		}
		gross = basic + da + ta + hra + bonus - pf;
		System.out.println("Gross salary is: " + gross);
	}
}