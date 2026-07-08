class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = 0;
        int r = m;
        int c = 0;

        if (c != nums2.length) {
            while (l < nums1.length) {
                if (nums1[l] > nums2[c] || l==r) {
                    while (r > l) {
                        nums1[r] = nums1[r-1];
                        r--;
                    }
                    nums1[l] = nums2[c];
                    c++;
                    r = m + c;
                    if (r >= nums1.length || c == nums2.length)
                        break;
                }
                l++;
            }
        }
    }
}