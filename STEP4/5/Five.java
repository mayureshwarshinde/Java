package hashing;

import java.util.HashMap;
import java.util.Map;

public class Five {
	
	public static int countPairs(int[] arr, int k) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : arr) {
			if(map.containsKey(k - i)) {
				count += map.get(k - i);
			}
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[][] arr = {
			{1, 5, 7, -1, 5},
			{1, 2, 3, 4, 5},
			{1, 1, 1, 1}
		};
		int[] k = {6, 7, 2};
		System.out.println(countPairs(arr[0], k[0]));
		System.out.println(countPairs(arr[1], k[1]));
		System.out.println(countPairs(arr[2], k[2]));
	}
}


