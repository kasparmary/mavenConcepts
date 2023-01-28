package Com.java.programes;

import java.util.List;
import java.util.ArrayList;

public class ArrayLista {
	public static void main(String[] args) {
		
		String txt = "aabbbccccddddd";
		System.out.println(txt.indexOf(0));
		char[] ss = txt.toCharArray();
		//tempa, teamp, tempc, a, b,c,d = null;
		int tempa = 0;
		int tempb= 0;
		int tempc = 0;
		int tempd = 0;
		for(int i = 0; i<txt.length(); i++) {
			System.out.println(ss[i]+"==="+txt.charAt(i));
			switch(txt.charAt(i)) {
			case 'a':
				tempa++;
				break;
			case 'b':
				tempb++;
				break;
			case 'c':
				tempc++;
				break;
			case 'd':
				tempd++;
				break;
			}
		}
		System.out.println(tempa+"---"+tempb+"---"+tempc+"----"+tempd);
		
	}
}
