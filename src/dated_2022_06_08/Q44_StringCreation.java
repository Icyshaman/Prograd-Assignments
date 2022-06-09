package dated_2022_06_08;

import java.util.Scanner;

public class Q44_StringCreation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of people likes the post: ");
		int num = sc.nextInt();
		String[] people = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.print("Enter " + (i + 1) + " person name: ");
			people[i] = sc.next();
		}
		if (num == 0) {
			System.out.print("no one");
		} else if (num >= 1) {
			if (num <= 3) {
				for (int i = 0; i < num; i++) {
					System.out.print(people[i]);
					if (i == num - 2) {
						System.out.print(" and ");
					} else if (i < num - 2) {
						System.out.print(", ");
					}
				}
			} else if (num > 3) {
				for (int i = 0; i < 2; i++) {
					System.out.print(people[i]);
					if (i < 1) {
						System.out.print(", ");
					}
				}
				System.out.print(" and " + (num - 2) + " others");
			}
		}
		System.out.println(" likes this.");
	}

}
