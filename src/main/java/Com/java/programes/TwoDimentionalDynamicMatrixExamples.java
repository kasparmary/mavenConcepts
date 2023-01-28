package Com.java.programes;

import java.util.Scanner;

public class TwoDimentionalDynamicMatrixExamples {
	
	public static void main(String[] args) {
		int[][] first= {{10,10,10},{20,20,20},{30,30,30}};
		int[][] second= {{1,1,1},{2,2,2},{3,3,3}};
		int[][] add = new int[3][3];
		int[][] sub = new int[3][3];
		
		//Addition
		System.out.println("Addition:");
		for(int r=0; r<3; r++) {
			for(int c=0; c<3; c++) {
				sub[r][c] = first[r][c] + second[r][c];
				System.out.print("("+first[r][c]+"+"+second[r][c]+")"+sub[r][c] + "\t");
			}
			System.out.println();
		}
		
		//Subtraction
		System.out.println("Subtraction:");
		for(int r=0; r<3; r++) {
			for(int c=0; c<3; c++) {
				sub[r][c] = first[r][c] - second[r][c];
				System.out.print(sub[r][c] + "\t");
			}
			System.out.println();
		}
	}
	
	
}
