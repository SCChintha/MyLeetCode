class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        
        int max = 0;
        int n = s.length();
        String s1 = "";

        for (int i = 0; i < n; i++) {
            // Odd length palindrome
            int p1 = i, p2 = i;
            while (p1 >= 0 && p2 < n) {
                if (s.charAt(p1) == s.charAt(p2)) {
                    int currLen = p2 - p1 + 1;
                    if (currLen > max) {
                        max = currLen;
                        s1 = s.substring(p1, p2 + 1);
                    }
                    p1--; 
                    p2++;
                } else {
                    break; // Stop expanding when characters don't match
                }
            }

            // Even length palindrome
            p1 = i; 
            p2 = i + 1;
            while (p1 >= 0 && p2 < n) {
                if (s.charAt(p1) == s.charAt(p2)) {
                    int currLen = p2 - p1 + 1;
                    if (currLen > max) {
                        max = currLen;
                        s1 = s.substring(p1, p2 + 1);
                    }
                    p1--; 
                    p2++;
                } else {
                    break; // Stop expanding when characters don't match
                }
            }
        }
        return s1;
    }
}





// class Solution {
//     public String longestPalindrome(String s) {
//         int max = 1;
//         int n = s.length();
//         String s1 = "";

//         for(int i=0; i<n; i++){
//             int curr = 1;
//             //odd length string
//             int p1=i, p2=i;
//             while(p1>=0 && p2<n){
//                 if(s.charAt(p1) == s.charAt(p2)){
//                     p1--;p2++;
//                     curr+=2;
//                     if(curr>max){
//                         max = curr;
//                         s1 = s.substring(p1, p2);
//                     }
//                 }
//             }
//             //even length string
//             p1=i; p2=i+1;
//             while(p1>=0 && p2<n){
//                 if(s.charAt(p1) == s.charAt(p2)){
//                     p1--;p2++;
//                     curr+=2;
//                     if(curr>max){
//                         max = curr;
//                         s1 = s.substring(p1, p2);
//                     }
//                 }
//             }
//         }
//         return s1;
//     }
// }