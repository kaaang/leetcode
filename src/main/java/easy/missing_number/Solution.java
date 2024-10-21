package easy.missing_number;

class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int total = (size*(size+1))/2;

        int current = 0;
        for(int i=0;i<nums.length;i++){
            current += nums[i];
        }

        return total-current;
    }
}
