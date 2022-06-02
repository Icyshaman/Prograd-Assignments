package dated_2022_06_01;

import java.util.Scanner;

public class Q19_PerfectNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int sumOfDivisor = 0;
		for(int i = 1; i<=num/2; i++) {
			if(num%i==0) {
				sumOfDivisor += i;
			}
		}
		if(sumOfDivisor==num) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not a perfect number");
		}

	}

}
