package Com.java.programes;

public class ArrayMatrix2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
		    
		//creating another matrix to store the multiplication of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<3; j++) {
				//for(int k=0; )
				c[i][j] = a[i][j] * b[j][i];
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		
	}

}
