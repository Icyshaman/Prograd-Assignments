package dated_2022_06_01;

import java.util.Scanner;

public class Q17_Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		String[] digitArray = Integer.toString(num).split("");
		String reverseNum = "";
		for (String digit : digitArray) {
			reverseNum = digit + reverseNum;
		}
		int revNum = Integer.parseInt(reverseNum);
		if(num == revNum) {
			System.out.println("It is Palindrome");
		}else {
			System.out.println("It is not Palindrome");
		}
	}

}
