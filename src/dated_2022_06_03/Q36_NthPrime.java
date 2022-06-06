package dated_2022_06_03;

import java.util.Scanner;

public class Q36_NthPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter which prime number you want: ");
		int num = sc.nextInt();
		boolean prime[] = new boolean[100001];
		for (int i = 0; i < prime.length; i++) {
			prime[i] = true;
		}
		prime[0] = false;
		prime[1] = false;
		for (int i = 2; i * i < prime.length; i++) {
			if (prime[i] == true) {
				for (int j = i * i; j < prime.length; j += i) {
					prime[j] = false;
				}
			}
		}
		int i = 0;
		int primeCounter = 0;
		for (boolean p : prime) {
			if (p) {
				primeCounter++;
				if(primeCounter == num) {
					System.out.print(i);
					break;
				}
			}
			i++;
		}

	}

}
