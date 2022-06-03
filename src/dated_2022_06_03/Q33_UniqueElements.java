package dated_2022_06_03;

import java.util.Scanner;

public class Q33_UniqueElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		int input, count = 0;
		for(int i=0;i<num;i++) {
			input=sc.nextInt();
			for(int j=0;j<i;j++) {
				if(input==arr[j]) {
					count++;
					break;
				}
			}
			arr[i]=input;
		}
		
		System.out.println("There are " + (num-count) + " unique.");

	}

}
