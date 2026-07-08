class Solution {
    public int strStr(String haystack, String needle) {
        int c=0;
        int l=0;
        int r=0;
        while(l<haystack.length()) {
            r=l;
            while(haystack.charAt(r) == needle.charAt(c)) {
                
                r++;
                c++;
                if(c== needle.length()) {
                    return l;
                }
                if(r==haystack.length()) return -1;
                
            } 
            c=0;
            l++;
        }

        return -1;
    }
}