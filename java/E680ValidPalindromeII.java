public class E680ValidPalindromeII {
// should use "or" instead of moving just one side of the pointer
    public boolean validPalindrome(String s) {
        int left = 0;
        int right =  s.length()  - 1;
        while(left<right){
            if (s.charAt(left) != s.charAt(right)){
                return isPalindrome(s, left+1,right)||isPalindrome(s, left,right-1);
            }else{
                left++;
                right--;
            }
        }
        return true;
    }

    public boolean isPalindrome(String s, int left, int right){
        while(left<right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}
