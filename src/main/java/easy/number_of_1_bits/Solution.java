package easy.number_of_1_bits;

class Solution {
    public int hammingWeight(int n) {
        int result = 0;

        while(n != 0){
            if((n&1) == 1) result ++;
            n = n>>1;
        }

        return result;
    }
}
