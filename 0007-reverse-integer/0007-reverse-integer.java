class Solution {
    public int reverse(int n) {
        int temp = n;        
        long rev=0;

        if(n<0){
            n = -1 * n;
            while(n!=0){
                int d = n%10;
                rev = d + (rev*10);
                n=n/10;
            }

            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
            return (int)rev*(-1);
        }
        
        while(n!=0){
            int d = n%10;
            rev = d + (rev*10);
            n=n/10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)rev;    
    }
}