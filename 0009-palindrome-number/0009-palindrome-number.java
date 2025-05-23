class Solution {
    public boolean isPalindrome(int x) {
        int reversed=0;
        int original=x;
        if(x<0 || x%10==0 && x!=0) return false;
        while(x>0){
            reversed = reversed * 10 + x%10;
            x/=10;
        }
        return reversed == original;
    }
}