package stringPract;

import java.util.HashMap;
import java.util.Set;

public class StringDuplicate {

		public static void main(String[] args) {

			String str = "abcxyzabcabc1xyz";
			char[] ar = str.toCharArray();
			System.out.println(ar.length);
			HashMap<Character, Integer>sma = new HashMap<Character, Integer>();
			for (char str1 : ar) {
				if (sma.containsKey(str1)) {
					sma.put(str1, sma.get(str1) + 1);
				} else {
					sma.put(str1, 1);
				}
			}
			Set<Character> keys = sma.keySet();	
			for(char key : keys)
				{
				if (sma.get(key) > 1) {
				System.out.println(key + " :" + sma.get(key));
				}
	}
	}}