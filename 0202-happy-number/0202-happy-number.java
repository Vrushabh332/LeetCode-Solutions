class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        int num;
        HashSet<Integer> elements= new HashSet<>();

        while(n>0) {
            num= n;
            while(num!=0) {
                sum= sum+ (int) Math.pow(num%10,2);
                num= num/10;
            }
            if(elements.contains(sum)) {
                return false;
            }
            elements.add(sum);
            
            if(sum==1) {
                return true;
            }
            
            n=sum;
            sum=0;
            
        }

        return false;
    }
}