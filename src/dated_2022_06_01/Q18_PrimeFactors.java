package dated_2022_06_01;

import java.util.Scanner;

public class Q18_PrimeFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		boolean prime[] = new boolean[num + 1];
		for (int i = 0; i < num + 1; i++) {
			prime[i] = true;
		}
		prime[0] = false;
		prime[1] = false;
		for (int i = 2; i * i < num + 1; i++) {
			if (prime[i] == true) {
				for (int j = i * i; j < num + 1; j += i)
					prime[j] = false;
			}
		}
		int primeCount = 0;
		for (boolean b : prime) {
			if (b) {
				primeCount++;
			}
		}
		int primes[] = new int[primeCount];
		int iterator = 0;
		for (int i = 0; i < prime.length; i++) {
			if (prime[i]) {
				primes[iterator] = i;
				iterator++;
			}
		}
		while (num > 1) {
			for (int p : primes) {
				if (num % p == 0) {
					System.out.print(p+" ");
					num /= p;
					break;
				}
			}
		}
	}

}
