package dated_2022_06_01;

import java.util.Scanner;

public class Q14_ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		String[] digitArray = Integer.toString(num).split("");
		String reverseNum = "";
		for (String digit : digitArray) {
			reverseNum = digit + reverseNum;
		}
		System.out.println(Integer.parseInt(reverseNum));

	}

}
