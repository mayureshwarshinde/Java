class Solution {
    public int[] applyOperations(int[] nums) {
        int numsSize = nums.length;
        int[] result = new int[numsSize];

        int j = 0;
        for(int i = 0; i < numsSize - 1; i++) {
            if(nums[i] == nums[i + 1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
            if(nums[i] != 0) {
                result[j] = nums[i];
                j++;
            }
        }
        
        if(nums[numsSize - 1] != 0) result[j] = nums[numsSize - 1];

        return result;
    }
}


/** with new array, and single iteration

TC : O(n)
SC : O(n)

*/
