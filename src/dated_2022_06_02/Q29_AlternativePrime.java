package dated_2022_06_02;

import java.util.Scanner;

public class Q29_AlternativePrime {

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
		int temp = 1;
		for (int i = 0; i < num + 1; i++) {
			if (prime[i]) {
				if(temp==1) {
				System.out.print(i + " ");
				temp = 2;
				}else {
					temp = 1;
				}
			}
		}
	}


}
