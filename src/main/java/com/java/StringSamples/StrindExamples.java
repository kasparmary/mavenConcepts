package com.java.StringSamples;

public class StrindExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "Joshua is a smart boy";
		System.out.println(txt);
		System.out.println(txt.charAt(3));
		System.out.println(txt.indexOf("s"));
		//System.out.println("--Join--"+ txt.join("--", txt));
		String[] txts = txt.split(" ");
		for (int i = 0; i < txts.length; i++) {
			String string = txts[i];
			String finalStr1 = string.join(" - ", txts);
			System.out.println(string + "--Its length--" + string.length());
		}
		System.out.println(String.join("-",txts));
	}

}
