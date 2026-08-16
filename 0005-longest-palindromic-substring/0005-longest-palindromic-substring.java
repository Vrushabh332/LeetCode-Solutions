class Solution {
    public String longestPalindrome(String s) {
        int c;
        int l;
        int r;
        int subLength=0;
        int start=0;
        int end=0;

        for(c=0;c<s.length();c++) {
            l=c;
            r=c;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
                l--;
                r++;
            }
            if(subLength<(r-l)-1) {
                subLength= (r-l)-1;
                start= l+1;
                end= r;
            }

            l=c;
            r=c+1;

            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)) {
                r++;
                l--;
            }
            if(subLength<(r-l)-1) {
                subLength= (r-l)-1;
                start= l+1;
                end= r;
            }
        }

        return s.substring(start,end);


    }
}