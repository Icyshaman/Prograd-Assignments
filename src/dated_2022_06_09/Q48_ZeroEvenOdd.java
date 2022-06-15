package dated_2022_06_09;

import java.util.Scanner;

class ZeroEvenOdd{
	private int oddNum = 1;
	private int evenNum = 2;
	public void zero() {
		System.out.print(0);
	}
	public void even() {
		System.out.print(this.evenNum);
		evenNum += 2;
	}
	public void odd() {
		System.out.print(this.oddNum);
		oddNum += 2;
	}
}

public class Q48_ZeroEvenOdd {

	public static void main(String[] args) {
		ZeroEvenOdd zeo = new ZeroEvenOdd();
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt() * 2;
		Thread t1 = new Thread(zeo::zero);
		Thread t2 = new Thread(zeo::even);
		Thread t3 = new Thread(zeo::odd);
		boolean isOddTurn = true;
		for (int i = 0; i < num; i++) {
			if(i%2 == 0) {
				t1.run();
			}else {
				if(isOddTurn) {
					t3.run();
					isOddTurn = false;
				}else {
					t2.run();
					isOddTurn = true;
				}
			}
		}
	}

}
