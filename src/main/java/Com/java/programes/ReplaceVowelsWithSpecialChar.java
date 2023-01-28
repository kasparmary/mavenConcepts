package Com.java.programes;

public class ReplaceVowelsWithSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputEle = "I Love MY Family";
		String afterReplacement = inputEle.replaceAll("[AEIOUaeiou]", "\\$");
		System.out.println(afterReplacement);
	}

}
