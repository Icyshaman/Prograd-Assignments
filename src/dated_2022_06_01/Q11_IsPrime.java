package dated_2022_06_01;

import java.util.Scanner;

public class Q11_IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to verify whether it's prime: ");
		int num = sc.nextInt();
		boolean flag = true;
		if (num <= 1) {
			System.out.println("Not Prime");
		} else if (num == 2) {
			System.out.println("Prime");
		} else {
			for (int i = 3; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}

			}
			if (flag) {
				System.out.println("Prime");
			} else {
				System.out.println("Not Prime");
			}
		}
	}

}
