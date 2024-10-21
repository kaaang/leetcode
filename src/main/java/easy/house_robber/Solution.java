package easy.house_robber;

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int prev1 = nums[0];
        int prev2 = Math.max(nums[0], nums[1]);

        for(int i=2;i<nums.length;i++){
            int temp = prev2;
            prev2 = Math.max(prev2, prev1+nums[i]);
            prev1 = temp;
        }

        return prev2;
    }

    public int rob2(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);

        for(int i=2; i<nums.length;i++){
            int third = Math.max(second, first+nums[i]);
            first = second;
            second = third;


        }

        return second;
    }
}
