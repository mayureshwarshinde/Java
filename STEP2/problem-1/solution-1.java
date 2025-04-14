class Solution {
    public int[] applyOperations(int[] nums) {
        int numsSize = nums.length;

        for(int i = 1; i < numsSize; i++) {
            if(nums[i - 1] == nums[i]){
                nums[i- 1] *= 2;
                nums[i] = 0;
            }
        }

        int[] result = new int[numsSize];
        int j = 0;
        for(int i = 0; i < numsSize; i++) {
            if(nums[i] != 0) {
                result[j] = nums[i];
                j++;
            }
        }
        
        return result;
    }
}


/** with new array, and double iteration

TC : O(2n) --> O(n)
SC : O(n)

*/
