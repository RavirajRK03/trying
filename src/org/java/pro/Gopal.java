package org.java.pro;

import java.util.ArrayList;
import java.util.List;

public class Gopal {

	public static void main(String[] args) {
		String str = "Gopal@21_21";
		String a = "";
		String b = "";
		String ca = "";
		char[] chat = str.toCharArray();
		List<Character> l = new ArrayList<Character>();
		
		
		for (char c : chat) {
			l.add(c);
		}
		for (int i = 0; i < l.size(); i++) {
			Character ch = l.get(i);
			if (Character.isAlphabetic(ch)) {
				a = a + ch;

			} else {
				b += ch;
			}

		}
		for (int i = a.length() - 1; i >= 0; i--) {
			char charAt = a.charAt(i);

			ca += charAt;

		}
		System.out.println(ca + b);
	}

}
