class Solution {
    public boolean isPalindrome(String s) {

        s= s.toLowerCase();

        int len= s.length();

        int l=0;
        int r= len-1;

        while(l<r) {
            
            while(l<len && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            while(r>=0 && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            if(l>= len || r<0) {
                return true;
            }

            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;

    }
}