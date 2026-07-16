class Solution {
    public String longestPalindrome(String s) {
        String res="";
        int resLen= 0;
        int l,r;

        for(int i=0;i<s.length();i++) {
            
            l=i;
            r=i;

            while(l>=0 && r<s.length() && s.charAt(l)== s.charAt(r)) {
                if((r-l+1) > resLen ) {
                    res= s.substring(l,r+1);
                    System.out.println(res);
                    resLen= r-l+1;
                }

                l--;
                r++;
            }

            l=i;
            r=i+1;

            while(l>=0 && r<s.length() && s.charAt(l)== s.charAt(r)) {
                if((r-l+1) > resLen ) {
                    res= s.substring(l,r+1);
                    System.out.println(res);
                    resLen= r-l+1;
                }

                l--;
                r++;
            }




        }

        return res;
    }
}