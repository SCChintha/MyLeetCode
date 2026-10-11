class Solution {
    public int reverse(int n) {
        long rev = 0;
        
        while (n != 0) {
            int d = n % 10;
            rev = d + (rev * 10);
            n = n / 10;
        }
        
        // Check for 32-bit signed integer overflow
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) rev;
    }
}




// class Solution {
//     public int reverse(int n) {
//         int temp = n;        
//         int rev=0;

//         if(n<0){
//             n = -1 * n;
//             while(n!=0){
//                 int d = n%10;
//                 rev = d + (rev*10);
//                 n=n/10;
//             }
//             return rev*(-1);
//         }
        
//         while(n!=0){
//             int d = n%10;
//             rev = d + (rev*10);
//             n=n/10;
//         }

//         if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
//             return 0;
//         }
//         return rev;    
//     }
// }