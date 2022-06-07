package dated_2022_06_06;

import java.util.Scanner;

public class Q38_MagicSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row/column of matrix: ");
		int r = sc.nextInt();
		int matrix[][] = new int[r][r];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int row[] = new int[r];
		int column[] = new int[r];
		int forwardDiag = 0;
		int backwardDiag = 0;
		int sumRow, sumColumn;
		for (int i = 0; i < r; i++) {
			sumRow = 0;
			sumColumn = 0;
			for (int j = 0; j < r; j++) {
				sumRow += matrix[i][j];
				sumColumn += matrix[j][i];
			}
			row[i] = sumRow;
			column[i] = sumColumn;
		}
		for (int i = 0; i < r; i++) {
			forwardDiag += matrix[i][i];
			backwardDiag += matrix[(r-1)-i][i];
		}
		int rowSum = row[0];
		int columnSum = column[0];
		boolean flag = true;
		for (int i : row) {
			if (i != rowSum) {
				flag = false;
				break;
			}
		}
		if (flag) {
			for (int i : column) {
				if (i != columnSum) {
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			if (columnSum != rowSum) {
				flag = false;
			}
		}
		if (flag) {
			if (backwardDiag != forwardDiag) {
				flag = false;
			}
		}
		if (flag) {
			if (backwardDiag != columnSum) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Magic Square");
		} else {
			System.out.println("Not Magic square");
		}
	}
}
