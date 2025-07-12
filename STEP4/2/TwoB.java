
class Solution {
    public boolean check(int[] a, int[] b) {
		Map<Integer, Integer> bMap = new HashMap<> ();
		for(int i : b) bMap.put(i, bMap.getOrDefault(i, 0) + 1);

		for(int i : a) {
			if(bMap.containsKey(i)) {
				bMap.put(i, bMap.get(i) - 1);
				if(bMap.get(i) == 0) bMap.remove(i);
			}
		}
		
		return bMap.isEmpty();
	}
	
    public boolean isSubset(int a[], int b[]) {
        return check(a, b);
    }
}
