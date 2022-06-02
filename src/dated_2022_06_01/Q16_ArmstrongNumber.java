package dated_2022_06_01;

import java.util.Scanner;

public class Q16_ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		String[] s = Integer.toString(num).split("");
		int sum = 0;
		for(String c: s) {
			sum += Math.pow(Integer.parseInt(c),3);
		}
		if(sum == num) {
			System.out.println("Number is Armstrong Number");
		}
		else {
			System.out.println("Number is not a Armstrong Number");
		}

	}

}
