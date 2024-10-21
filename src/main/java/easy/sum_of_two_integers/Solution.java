package easy.sum_of_two_integers;

class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int withOutCarry = a ^ b;
            int carry = (a & b) << 1;

            a = withOutCarry;
            b = carry;
        }

        return a;
    }
}
