package dated_2022_06_03;

import java.util.Scanner;

public class Q32_DuplicatesCountArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		int duplicates[] = new int[num];
		int dupIterator = 0;
		boolean dflag;
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++) {
			dflag=false;
			for(int d=0; d<=dupIterator;d++) {
				if(arr[i]==duplicates[d]) {
					dflag=true;
					break;
				}
			}
			if(!dflag) {
				for(int j=i+1;j<num;j++) {
					if(arr[i]==arr[j]) {
						duplicates[dupIterator]=arr[i];
						dupIterator++;
						break;
					}
				}
			}
		}

		System.out.println("There are " + dupIterator + " duplicates.");
	}

}
