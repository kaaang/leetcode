package easy.two_sum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Object, Object> maps = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            maps.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            if(maps.containsKey(target-nums[i]) && (int) maps.get(target-nums[i]) != i){
                return new int[]{i, (int) maps.get(target-nums[i])};
            }
        }

        return null;
    }
}
