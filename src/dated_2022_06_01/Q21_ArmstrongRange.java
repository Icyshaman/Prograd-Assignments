package dated_2022_06_01;

import java.util.Scanner;

public class Q21_ArmstrongRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start number: ");
		int start = sc.nextInt();
		System.out.print("Enter the end number: ");
		int end = sc.nextInt();
		int sum;
		for (int i = start; i <= end; i++) {
			String[] s = Integer.toString(i).split("");
			sum = 0;
			for (String c : s) {
				sum += Math.pow(Integer.parseInt(c), 3);
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
	}

}
