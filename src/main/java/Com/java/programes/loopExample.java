package Com.java.programes;

public class loopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Reverse pramid
		/*int k = 1;
		for(int i=0; i<=4; i++) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(k+"\t");
				k++;
			}
			System.out.println();
		}*/
		
		//pramid
		int k = 3;
		for(int i=0; i<=3; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(k+"\t");
				k = k+3;
			}
			System.out.println();
		}
	}

}
