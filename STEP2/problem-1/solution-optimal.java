class Solution {
    public int[] applyOperations(int[] nums) {
        int numsSize = nums.length;
        int j = 0;

        for(int i = 0; i < numsSize - 1; i++) {
            if(nums[i] == nums[i + 1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
            if(nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        if(nums[numsSize - 1] != 0) {
            nums[j] = nums[numsSize - 1];
            j++;
        }
        
        while(j < numsSize) {
            nums[j] = 0;
            j++;
        }

        return nums;
    }
}


/** using same array, single iteration

TC : O(n)
SC : O(1)

*/

