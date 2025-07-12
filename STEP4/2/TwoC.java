package hashing.Two;

import java.util.HashMap;
import java.util.Map;

public class TwoC {
	public static int count(int[] arr) {
		int maxFrequency = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
			maxFrequency = Math.max(maxFrequency, map.get(i));
		}
		return arr.length - maxFrequency;
	}
	
	public static void main(String[] args) {
		int[][] arr = {
				{1, 2, 3, 4},
				{1, 2, 2, 3},
				{1, 1, 1, 1}
		};
		System.out.println(count(arr[0]));
		System.out.println(count(arr[1]));
		System.out.println(count(arr[2]));
	}
}


/*
 * Minimum operation to make all elements equal in array
 */
