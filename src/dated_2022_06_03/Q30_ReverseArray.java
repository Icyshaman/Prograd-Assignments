package dated_2022_06_03;

import java.util.Scanner;

public class Q30_ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=num-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
