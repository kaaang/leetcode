package easy.valid_palindrome;

class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            while(start < end && !Character.isLetterOrDigit(arr[start])){
                start++;
            }
            while(start < end && !Character.isLetterOrDigit(arr[end])){
                end--;
            }

            if(Character.toLowerCase(arr[start]) != Character.toLowerCase(arr[end])){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public boolean isPalindrome1(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }

        String temp = sb.toString();
        String revers = sb.reverse().toString();

        return temp.equals(revers);
    }
}
