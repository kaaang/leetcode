package easy.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for(int i: nums) {
            if(!s.add(i)) return true;
        }
        return false;
    }
}
