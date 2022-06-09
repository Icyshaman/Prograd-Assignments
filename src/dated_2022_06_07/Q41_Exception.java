package dated_2022_06_07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q41_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the numerator: ");
			int num = sc.nextInt();
			System.out.print("Enter the denomenator: ");
			int den = sc.nextInt();
			if(den==0) {
				throw new ArithmeticException("Divide by 0 error.");
			}
			float result = (float)num/den;
			System.out.println("Result is "+result);
		}
		catch (InputMismatchException e) {
			System.out.println(e+": Please input valid signed 32 bit integer value.");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}
