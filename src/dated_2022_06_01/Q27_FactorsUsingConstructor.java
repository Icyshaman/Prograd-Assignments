package dated_2022_06_01;

import java.util.Scanner;

class Factors {

	Factors(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}

public class Q27_FactorsUsingConstructor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		new Factors(num);
	}

}
