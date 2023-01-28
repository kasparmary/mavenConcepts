package Com.java.programes;

public class JoinStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create first string
	    String first = "Java";
	    System.out.println("First String: " + first);

	    // create second
	    String second = "Programming";
	    System.out.println("Second String: " + second);

	    // join two strings
	    String joinedString = first.concat(second);
	    System.out.println("Joined String: " + joinedString);
	    
	    System.out.println(String.join(" ", first, second));
	}

}
