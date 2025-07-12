package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrence {
	public static void main(String[] args) {
		String str = "hello world";
		str = str.replace(" ", "");
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}
		
		System.out.println("Character occurences:");
		for(Map.Entry<Character, Integer> mp : map.entrySet()) {
			System.out.println(mp.getKey() + " : " + mp.getValue());
		}
	}
}




/* 
 * Program to count occurence of character in a given string
*/
