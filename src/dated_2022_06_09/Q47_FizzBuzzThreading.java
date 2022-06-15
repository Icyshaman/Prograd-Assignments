package dated_2022_06_09;

import java.util.Scanner;

class FizBuzz {
	private int num = 0;

	public Runnable printFizz() {
		this.num += 1;
		System.out.print("fizz ");
		return null;
	}

	public Runnable printBuzz() {
		this.num += 1;
		System.out.print("buzz ");
		return null;
	}

	public Runnable printFizzBuzz() {
		this.num += 1;
		System.out.print("fizzbuzz ");
		return null;
	}

	public Runnable printNnumber() {
		this.num += 1;
		System.out.print(num+" ");
		return null;
	}

}

public class Q47_FizzBuzzThreading{

	public static void main(String[] args) {
		FizBuzz fBuzz = new FizBuzz();
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int end = sc.nextInt();
		Thread t1 = new Thread(fBuzz::printFizz);
		Thread t2 = new Thread(fBuzz::printBuzz);
		Thread t3 = new Thread(fBuzz::printFizzBuzz);
		Thread t4 = new Thread(fBuzz::printNnumber);
		for (int i = 1; i <= end; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				t3.run();
			}else if (i%3==0) {
				t1.run();
			}else if (i%5 ==0) {
				t2.run();
			}else {
				t4.run();
			}
		}

	}

}
