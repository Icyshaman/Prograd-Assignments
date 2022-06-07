package dated_2022_06_06;

import java.util.Scanner;

public class Q37_TopperIdentifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the registration number: ");
		long regNum = sc.nextLong();
		String[] digitArray = Long.toString(regNum).split("");
		long sumOdd = 0;
		long sumEven = 0;
		byte toogler = 1;
		for(String digit: digitArray) {
			if(toogler == 1) {
				sumOdd += Integer.parseInt(digit);
				toogler = 2;
			}else {
				sumEven += Integer.parseInt(digit);
				toogler = 1; 
			}
		}
		if(sumEven == sumOdd) {
			System.out.println("Probable topper number");
		}else {
			System.out.println("Not a probabale topper number");
		}

	}

}
