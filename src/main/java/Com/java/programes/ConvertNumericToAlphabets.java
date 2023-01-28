package Com.java.programes;

public class ConvertNumericToAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aa = "1234";
		for (int i = 0; i<aa.length(); i++) {
			char a = aa.charAt(i);
			switch(a) {
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
				case 4:
					System.out.println("four");
					break;
			}
		}
		
	}

}
