package Com.java.programes;

import org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator;

public class RemoeGivenCharater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss = "Kasparmary";
		String ss1 = "Kasparmarysad";
		char ch = 'a';
		char ch1 = 'm';
		String str = "";
		System.out.println(ss.replace("a", ""));
		for(int i = 0; i<ss1.length(); i++) {
			if (ss1.charAt(i) != ch && ss1.charAt(i) != ch1) {
				str += ss1.charAt(i);
			}
		}
		System.out.println(str);
	}

}
