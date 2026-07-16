class Solution {
    public int maxArea(int[] height) {
        int A=0;
        int l=0;
        int r=height.length-1;

        while(l!=r) {
            if(height[l]<height[r]) {
                if(height[l]*(r-l) > A) {
                    A= height[l]*(r-l);
                }
                l++;
            } else {
                if(height[r]*(r-l) > A) {
                    A= height[r]*(r-l);
                }
                r--;
            }

            // System.out.println(A);
        }

        return A;

    }
}