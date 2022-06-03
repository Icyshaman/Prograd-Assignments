package dated_2022_06_03;

import java.util.Scanner;

public class Q34_SecondLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int arr[] = new int[num];
		int input;
		for(int i=0;i<num;i++) {
			input = sc.nextInt();
			if(input>max) {
				max=input;
			}
			arr[i]=input;
		}
		int copyArr[] = new int[num];
		for(int i=0; i<num; i++) {
			if(arr[i] != max) {
				copyArr[i]= arr[i]; 
			}
		}
		max = Integer.MIN_VALUE;
		for(int i: copyArr) {
			if(i>max) {
				max = i;
			}
		}
		System.out.println("Second Maximum is: " + max);
	}

}
