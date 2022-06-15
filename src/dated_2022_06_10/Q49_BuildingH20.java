package dated_2022_06_10;

import java.util.Scanner;

class H20 implements Runnable {
	private volatile int oxygenCount;
	private volatile int hydrogenCount;

	public H20(String water) {
		this.oxygenCount = water.length() / 3;
		this.hydrogenCount = this.oxygenCount * 2;
	}

	public void releaseHydrogen() {
		System.out.print("O");
		this.hydrogenCount -= 2;
	}

	public void releaseOxygen() {
		System.out.print("HH");
		this.oxygenCount -= 1;
	}

	@Override
	public void run() {
		synchronized (this) {
			while (this.oxygenCount >= 1 || this.hydrogenCount >= 2) {
				if (Thread.currentThread().getName() == "Thread-Oxygen" && this.oxygenCount >= 1) {
					releaseOxygen();
					try {
						notifyAll();
						this.wait();
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				} else if (Thread.currentThread().getName() == "Thread-Hydrogen" && this.hydrogenCount >= 2) {
					releaseHydrogen();
					try {
						notifyAll();
						this.wait();
					} catch (InterruptedException e) {
						System.out.println(e);
					}
					
				} 
			}
			notifyAll();
			Thread.currentThread().interrupt();
		}
		

	}

}

public class Q49_BuildingH20 {

	public static void main(String[] args) throws InterruptedException {
		System.out.print("Enter elements of water that need to be syncronized: ");
		Scanner sc = new Scanner(System.in);
		String water = sc.next();
		H20 h = new H20(water);
		Thread oxygen = new Thread(h, "Thread-Oxygen");
		Thread hydrogen = new Thread(h, "Thread-Hydrogen");
		oxygen.start();
		hydrogen.start();	
	}
}
