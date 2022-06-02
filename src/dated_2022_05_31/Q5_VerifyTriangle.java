package dated_2022_05_31;

import java.util.Scanner;

public class Q5_VerifyTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float angle1, angle2, angle3;
		System.out.print("Enter 1st angle: ");
		angle1 = sc.nextFloat();
		System.out.print("Enter 2nd angle: ");
		angle2 = sc.nextFloat();
		System.out.print("Enter 3rd angle: ");
		angle3 = sc.nextFloat();
		if (angle1 + angle2 + angle3 == 180) {
			System.out.println("It is a valid triangle");
		} else {
			System.out.println("It is not a valid triangle");
		}
	}
}
