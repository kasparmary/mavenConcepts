package com.java.StringSamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class StringReverse {

	private static final String List = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aa ="kaspar";
		String bb ="Joshua";
		String cc ="Anand";
		
		StringBuffer sb = new StringBuffer();
		//StringBuffer finalaa=  sb.insert(0, aa);
		StringBuffer finalaa=  sb.append(aa);
		System.out.println(finalaa.reverse());

		
		//Own logic
		String afteReverse = "";
		char[] charArr = bb.toCharArray();
		for (int i=charArr.length-1; i>=0; i--) {
			afteReverse += charArr[i];
		}		
		System.out.println(afteReverse);
		
		
		
		///Using collection
		char[] ccc = cc.toCharArray();
		ArrayList<Character> ll = new ArrayList<Character>();
		
		for (Character character : ccc) {
			ll.add(character);
		}
			System.out.println(ll);
			Collections.reverse(ll);
			ListIterator<Character> hh=ll.listIterator();
			while(hh.hasNext()) {
				System.out.print(hh.next());
			}
	}

}
