package corejavaprograms.list;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestString {
	
	static int lengthOfString(String str) {
		
		/*
		 * long len=str.chars().distinct().count(); return (int) len;
		 */
		Set<Character> set=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
				set.add(ch);			
		}
		return set.size();
	}

	public static void main(String[] args) {
     String str="pwwkew";
     //abc : 3
     System.out.println(lengthOfString(str));
     
		
	}

}
 