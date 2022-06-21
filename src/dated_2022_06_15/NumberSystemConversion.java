package dated_2022_06_15;

import java.util.Scanner;

public class NumberSystemConversion {

	public static String getInput(Scanner sc) {
		System.out.print("Enter the number: ");
		return sc.next();
	}

	public static void printMenu() {
		System.out.println("Following Number System are associated with given keys:");
		System.out.println("Binary\t\t1");
		System.out.println("Decimal\t\t2");
		System.out.println("Octal\t\t3");
		System.out.println("Hexadecimal\t4");
	}

	public static String binaryToOctal(String inputValue) {
		return Integer.toOctalString(binaryToDecimal(inputValue));
	}

	public static int binaryToDecimal(String inputValue) {
		return Integer.parseInt(inputValue, 2);
	}

	public static String binaryToHexadecimal(String inputValue) {
		return Integer.toHexString(binaryToDecimal(inputValue));
	}

	public static String octalToBinary(String inputValue) {
		return Integer.toBinaryString(octalToDecimal(inputValue));
	}

	public static int octalToDecimal(String inputValue) {
		return Integer.parseInt(inputValue, 8);
	}

	public static String octalToHexadecimal(String inputValue) {
		return Integer.toHexString(octalToDecimal(inputValue));
	}

	public static String decimalToBinary(String inputValue) {
		return Integer.toBinaryString(Integer.parseInt(inputValue));
	}

	public static String decimalToOctal(String inputValue) {
		return Integer.toOctalString(Integer.parseInt(inputValue));
	}

	public static String decimalTohexadecimal(String inputValue) {
		return Integer.toHexString(Integer.parseInt(inputValue));
	}

	public static String hexadecimalToBinary(String inputValue) {
		return Integer.toBinaryString(hexadecimalToDecimal(inputValue));
	}

	public static String hexadecimalToOctal(String inputValue) {
		return Integer.toOctalString(hexadecimalToDecimal(inputValue));
	}

	public static int hexadecimalToDecimal(String inputValue) {
		return Integer.parseInt(inputValue, 16);
	}

	public static void main(String[] args) {
		mainMenu: do {
			printMenu();
			System.out.println("Exit\t\t5");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your choice in which you want to enter input (1-5): ");
			byte numSysInChoice = sc.nextByte();
			String numInput = "";
			boolean isValidInput = true;
			switch (numSysInChoice) {
			case 1: {
				numInput = getInput(sc);
				try {
					if (!(numInput.matches("[0-1]+"))) {
						throw new NumberFormatException("Invalid Input, expecting octal number");
					}
				} catch (NumberFormatException e) {
					isValidInput = false;
					System.out.println(e);
				}
				break;
			}
			case 2: {
				numInput = getInput(sc);
				try {
					if (!(numInput.matches("[0-9]+"))) {
						throw new NumberFormatException("Invalid Input, expecting decimal number");
					}
				} catch (NumberFormatException e) {
					isValidInput = false;
					System.out.println(e);
				}
				break;
			}
			case 3: {
				numInput = getInput(sc);
				try {
					if (!(numInput.matches("[0-7]+"))) {
						throw new NumberFormatException("Invalid Input, expecting octal number");
					}
				} catch (NumberFormatException e) {
					isValidInput = false;
					System.out.println(e);
				}
				break;
			}
			case 4: {
				numInput = getInput(sc);
				try {
					if (!(numInput.matches("[0-9A-Fa-f]+"))) {
						throw new NumberFormatException("Invalid Input, expecting hexadecimal number");
					}
				} catch (NumberFormatException e) {
					isValidInput = false;
					System.out.println(e);
				}
				break;
			}
			case 5: {
				System.out.println("Thank You!");
				break mainMenu;
			}
			default: {
				isValidInput = false;
				System.out.println("Invalid Input");
			}

			}

			System.out.println("\n");

			if (isValidInput) {
				boolean doContinue = true;
				while (doContinue) {
					printMenu();
					System.out.print("Enter your choice in which you want to get your output (1-4): ");
					byte numSysOutChoice = sc.nextByte();
					switch (numSysInChoice) {
					case 1: {
						switch (numSysOutChoice) {
						case 1: {
							System.out.println(numInput);
							break;
						}
						case 2: {
							System.out.println(binaryToDecimal(numInput));
							break;
						}
						case 3: {
							System.out.println(binaryToOctal(numInput));
							break;
						}
						case 4: {
							System.out.println(binaryToHexadecimal(numInput));
							break;
						}
						}
						break;
					}
					case 2: {
						switch (numSysOutChoice) {
						case 1: {
							System.out.println(decimalToBinary(numInput));
							break;
						}
						case 2: {
							System.out.println(numInput);
							break;
						}
						case 3: {
							System.out.println(decimalToOctal(numInput));
							break;
						}
						case 4: {
							System.out.println(decimalTohexadecimal(numInput));
							break;
						}
						}
						break;
					}
					case 3: {
						switch (numSysOutChoice) {
						case 1: {
							System.out.println(octalToBinary(numInput));
							break;
						}
						case 2: {
							System.out.println(octalToDecimal(numInput));
							break;
						}
						case 3: {
							System.out.println(numInput);
							break;
						}
						case 4: {
							System.out.println(octalToHexadecimal(numInput));
							break;
						}
						}
						break;
					}
					case 4: {
						switch (numSysOutChoice) {
						case 1: {
							System.out.println(hexadecimalToBinary(numInput));
							break;
						}
						case 2: {
							System.out.println(hexadecimalToDecimal(numInput));
							break;
						}
						case 3: {
							System.out.println(hexadecimalToOctal(numInput));
							break;
						}
						case 4: {
							System.out.println(numInput);
							break;
						}
						}
						break;
					}
					default: {
						System.out.println("Invalid Input");
					}
					}
					System.out.println();
					System.out.print("Do you want to continue with same number (yes/no): ");
					String choiceString = sc.next().toLowerCase();
					if(choiceString.equals("no")) {
						doContinue=false;
					}else if (!(choiceString.equals("yes"))) {
						System.out.println("Invalid Input, we are accepting it as yes");
					}
					System.out.println();
				}
			}
		} while (true);

	}

}
