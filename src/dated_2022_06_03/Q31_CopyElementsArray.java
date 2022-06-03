package dated_2022_06_03;

import java.util.Scanner;

public class Q31_CopyElementsArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int copyArr[] = new int[num];
		for(int i=0;i<num;i++) {
			copyArr[i]=arr[i];
		}
		System.out.print("Original Array: ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.print("\nCopied Array: ");
		for(int i: copyArr) {
			System.out.print(i+" ");
		}

	}

}
