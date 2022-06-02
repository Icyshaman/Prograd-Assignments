package dated_2022_06_02;

import java.util.Scanner;

public class Q28_TabelUsingRecursion {
	public static int printTable(int num, int i) {
		if(i >10) {
			return 0;
		}
		System.out.println(num + " x " + i + " = " + num*i);
		printTable(num, i+1);
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		printTable(num, 1);
	}
}
