package hashing.Two;

import java.util.HashSet;
import java.util.Set;

public class TwoD {
	public static boolean check(int[] arr, int k) {
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(set.contains(arr[i])) return true;
			set.add(arr[i]);
			if(i >= k) set.remove(arr[i - k]);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int[][] arr = {
				{1, 2, 3, 4, 1, 2, 3, 4},
				{1, 2, 3, 1, 4, 5},
				{6, 8, 4, 1, 8, 5, 7},
				{2, 2, 2, 1, 8, 5, 7},				// if you are first filling window, then this edge will fail if while filling the contents are not checked for duplicacy    
		};
		
		System.out.println(check(arr[0], 3));
		System.out.println(check(arr[1], 3));
		System.out.println(check(arr[2], 3));
		System.out.println(check(arr[3], 3));
	}
}
