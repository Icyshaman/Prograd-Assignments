package dated_2022_06_01;

import java.util.Scanner;

public class Q25_FibonacciTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number upto which fibonacci wanted: ");
		int nFib = sc.nextInt();
		int fibSeries[] = new int[nFib];
		fibSeries[0] = 1;
		if (nFib > 1) {
			fibSeries[1] = 1;
			for (int i = 2; i < nFib; i++) {
				fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
			}
		}
		for (int i = 0; i < nFib; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(fibSeries[j]+" ");
			}
			System.out.println();
		}
	}
}
