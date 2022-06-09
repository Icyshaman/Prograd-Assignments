package dated_2022_06_08;

import java.util.Scanner;

public class Q45_StringSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String[] words = sc.nextLine().split(" ");
		int wordStrength[] = new int[words.length];
		int strengthOfWord;
		int j = -1;
		for (String word : words) {
			strengthOfWord = 0;
			j++;
			for (char c : word.toCharArray()) {
				strengthOfWord += ((int) c - 96);
			}
			wordStrength[j] = strengthOfWord;
		}
		int maxStrength = Integer.MIN_VALUE;
		int maxIndex = -1;
		
		for(int i =0; i<wordStrength.length;i++) {
			if (wordStrength[i] > maxStrength) {
				maxStrength = wordStrength[i];
				maxIndex = i;
			} else if(maxStrength == wordStrength[i]) {
				int lexioStrength = words[maxIndex].compareTo(words[i]);
				if(lexioStrength > 0) {
					maxStrength = wordStrength[i];
					maxIndex = i;
				}
					
			}
		}
		System.out.println(words[maxIndex]);
	}

}
