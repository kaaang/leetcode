package easy.valid_anagram;

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> maps = new HashMap<>();
        for(char c : s.toCharArray()){
            maps.put(c, maps.getOrDefault(c, 0) + 1);
        }

        for(char c: t.toCharArray()){
            if(maps.getOrDefault(c, 0) == 0){
                return false;
            }else{
                maps.put(c, maps.get(c)-1);
            }
        }

        return true;
    }
}
