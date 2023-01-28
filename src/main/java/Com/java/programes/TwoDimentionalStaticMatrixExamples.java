package Com.java.programes;

import java.util.Scanner;

public class TwoDimentionalStaticMatrixExamples {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row length matrix:");
		int row = sc.nextInt();
		
		System.out.println("enter Column length matrix");
		int col = sc.nextInt();
		int[][] first= new int[row][col];
		int[][] second= new int[row][col];
		
		for(int r=0; r<row; r++) {
			for(int c=0; c<col; c++) {
				System.out.println(String.format("Enter First[%d][%d] integer", r, c));
				first[r][c] = sc.nextInt();
			}
		}
		
		for(int r=0; r<row; r++) {
			for(int c=0; c<col; c++) {
				System.out.println(String.format("Enter Second[%d][%d] integer", r, c));
				second[r][c] = sc.nextInt();
			}
		}
		System.out.println("First Matrix input");
		print2Array(first);
		System.out.println("Second Matrix input");
		print2Array(second);
		
		System.out.println("Matrix Addition");
		sum(first, second);
		
		System.out.println("Matrix Subtraction");
		sub(first, second);
		
		System.out.println("Matrix Multiplication");
		mul(first, second);
	}
	
	public static void sum(int[][] first, int[][] second) {
		int row = first.length;
		int col = first[0].length;
		int[][] sum = new int[row][col];
		for(int r=0; r<first.length; r++) {
			for(int c=0; c<second.length; c++) {
				sum[r][c] = first[r][c] + second[r][c];
			}
		}
		print2Array(sum);
	}
	
	public static void sub(int[][] first, int[][] second) {
		int row = first.length;
		int col = first[0].length;
		int[][] sub = new int[row][col];
		for(int r=0; r<first.length; r++) {
			for(int c=0; c<second.length; c++) {
				sub[r][c] = first[r][c] - second[r][c];
			}
		}
		print2Array(sub);
	}
	
	public static void mul(int[][] first, int[][] second) {
		int row = first.length;
		int col = first[0].length;
		int[][] mul = new int[row][col];
		for(int r=0; r<first.length; r++) {
			for(int c=0; c<second.length; c++) {
				mul[r][c] = first[r][c] * second[r][c];
			}
		}
		print2Array(mul);
	}
	
	public static void print2Array(int[][] arrVal) {
		System.out.println(arrVal.length+"---"+arrVal[0].length);
		for(int r=0; r<arrVal.length; r++) {
			for(int c=0; c<arrVal[0].length; c++) {
				System.out.print(arrVal[r][c] + "\t");
			}
			System.out.println();
		}
	}
	
}
