package hashing.Two;

import java.util.HashSet;
import java.util.Set;

public class TwoE {
	
	public static boolean check(int[] arr, int target) {
		Set<Integer> set = new HashSet<>();
		for(int i : arr) {
			if(set.contains(target - i)) return true;
			set.add(i);
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[][] arr = {
				{0, -1, 2, -3, 1},
				{1, -2, 1, 0, 5},
				{11}
		};
		int[] t = {-2, 0, 11};
		
		System.out.println(check(arr[0], t[0]));
		System.out.println(check(arr[1], t[1]));
		System.out.println(check(arr[2], t[2]));
	}
}
