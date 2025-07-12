package hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoA {
	public static boolean check(int[] a, int[] b) {
		Map<Integer, Boolean> map = new HashMap<>();
		
		for(int i = 0; i < a.length; i++) {
			map.put(a[i], true);
		}
		
		for(int i = 0; i < b.length; i++) {
			if(!map.containsKey(b[i])) return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		int[] a = {11, 1, 13, 21, 3, 7};
		int[] b = {11, 3, 7, 1};
		
		System.out.println("b subset of a? : " + check(a, b));
	}
}
