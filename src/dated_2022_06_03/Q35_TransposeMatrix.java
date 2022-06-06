package dated_2022_06_03;

import java.util.Scanner;

public class Q35_TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of row: ");
		int row = sc.nextInt();
		System.out.print("Enter number of column: ");
		int column = sc.nextInt();
		int[][] matrix = new int[row][column];
		for(int i=0; i<row;i++) {
			for(int j=0; j<column;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		int[][] transposeMatrix = new int[column][row];
		for(int i=0; i<column;i++) {
			for(int j=0; j<row;j++) {
				transposeMatrix[i][j]=matrix[j][i];
			}
		}
		for(int[] r: matrix) {
			for(int c: r) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int[] r: transposeMatrix) {
			for(int c: r) {
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
