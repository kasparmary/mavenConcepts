package Com.java.programes;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aaa = "Hello world kaspar mary!";
		String aa = "welcomemary";
		String[] out = aa.split(" ");
		int cnt = 1;
		for (int i = 0; i < aa.length(); i++) {
			if (aa.charAt(i) == 'a' || aa.charAt(i) == 'e' || aa.charAt(i) == 'i' || aa.charAt(i) == 'o'
					|| aa.charAt(i) == 'u')
				cnt++;
		}
		System.out.println("total vowels" + cnt);
	}

}
