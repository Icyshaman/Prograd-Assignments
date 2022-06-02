package dated_2022_06_01;

import java.util.Scanner;

public class Q12_PrimeRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to start: ");
		int start = sc.nextInt();
		System.out.print("Enter the number to end: ");
		int end = sc.nextInt();
		boolean prime[] = new boolean[end + 1];
		for (int i = 0; i < end + 1; i++) {
			prime[i] = true;
		}
		prime[0] = false;
		prime[1] = false;
		for (int i = 2; i * i < end + 1; i++) {
			if (prime[i] == true) {
				for (int j = i * i; j < end + 1; j += i)
					prime[j] = false;
			}
		}
		for (int i = start; i < end + 1; i++) {
			if (prime[i]) {
				System.out.print(i + " ");
			}
		}
	}

}
