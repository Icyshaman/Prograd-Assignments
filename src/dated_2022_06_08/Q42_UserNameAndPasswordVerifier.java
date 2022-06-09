package dated_2022_06_08;

import java.util.Scanner;

class InvalidUserName extends Exception {
	public InvalidUserName(String msg) {
		super(msg);
	}
}

class InvalidPassword extends Exception {
	public InvalidPassword(String msg) {
		super(msg);
	}
}

public class Q42_UserNameAndPasswordVerifier {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the UserName: ");
			String userName = sc.next();
			if (!(userName.length() >= 6 && userName.length() <= 15)) {
				throw new InvalidUserName(
						"Invalid User Name (User name length should be in between 6 and 15 both inclusive)");
			}
			if (!((int) userName.charAt(0) >= 65 && (int) userName.charAt(0) <= 90)) {
				throw new InvalidUserName("Invalid User Name (First letter should be capital alphabet)");
			}
			sc.nextLine();
			System.out.print("Enter the Password: ");
			String password = sc.nextLine();
			if (!(password.length() >= 8 && userName.length() <= 256)) {
				throw new InvalidPassword(
						"Invalid Password (Password length should be in between 8 and 256 both inclusive)");
			}
			if (password.contains(" ") || password.contains("(") || password.contains(")")) {
				throw new InvalidPassword("Invalid Password (Password should not contain whitespaces and parentheses)");
			}
			if (password.toLowerCase().contains(userName.toLowerCase())) {
				throw new InvalidPassword("Invalid Password (Password should not contain User Name)");
			}
		} catch (InvalidUserName e) {
			System.out.println(e.getMessage());
		} catch (InvalidPassword e) {
			System.out.println(e.getMessage());
		}
	}
}
