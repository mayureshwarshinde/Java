package hashing;

import java.util.HashMap;
import java.util.Map;

public class Three {
	
	public static void getMaxMinFreq(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int min = arr[0];
		int max = arr[0];
		for(int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() < map.get(min)) min = entry.getKey();
			if(entry.getValue() > map.get(max)) max = entry.getKey();
		}
		System.out.println("\nMin: " + min + " = " + map.get(min));
		System.out.println("Max: " + max + " = " + map.get(max));
	}
	
	public static void main(String[] args) {
		int[][] arr = {
			{3,2,3,2,4,3},
			{1, 2, 2, 3, 3, 3, 4},
			{7, 7, 7, 5, 5, 6, 6, 6}
		};
		getMaxMinFreq(arr[0]);
		getMaxMinFreq(arr[1]);
		getMaxMinFreq(arr[2]);
	}
}
