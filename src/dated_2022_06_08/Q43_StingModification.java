package dated_2022_06_08;

import java.util.Scanner;

public class Q43_StingModification {

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String result = "";
		for(String s: num.split("")) {
			if(Integer.parseInt(s) < 5) {
				result += "0";
			}else {
				result += "1";
			}
		}
		System.out.println(result);

	}

}
