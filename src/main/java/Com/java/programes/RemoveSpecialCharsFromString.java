package Com.java.programes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSpecialCharsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "This#string%contains^special*characters&.";  
		//findSpecialChars(str);
		str = str.replaceAll("[^a-zA-Z0-9]", " ");  
		System.out.println(str); 
		
		String aa="$1234TES$,@4564GFRE@,$ERT1234#,@1234TES#";
		String[] aaa = aa.split(",");
		System.out.println(aaa.length);
		List<String> ll=new ArrayList<String>();
		for (String str1 : aaa) {
			Boolean isSpecialChar = false;
			Boolean bothSame = false;
			//System.out.println(str1+"==length==:"+str1.length());
			int strLen = str1.length();
			//Character.isLetterOrDigit(str1.charAt(0));
			if(!Character.isLetterOrDigit(str1.charAt(0)) || !Character.isLetterOrDigit(str1.charAt(strLen-1))) {
				isSpecialChar = true;
			}
			if (str1.charAt(0) == str1.charAt(strLen-1)) {
				bothSame = true;
			}
			String updatedString = str1.substring(1, strLen-1);
			System.out.println(updatedString);
			Pattern p = Pattern.compile("[a-zA-Z0-9]+");
			Matcher m = p.matcher(updatedString);
			boolean result = m.matches();
			System.out.println(isSpecialChar+"---"+bothSame+"----"+result);
			
			if (isSpecialChar && bothSame && result) {
				ll.add(str1);
			}
			 
		}
		System.out.println(ll);
	}
	
	

}
