class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        
        int max=0;
        
        for(int i=0;i<s.length();i++){
            Set<Character> set = new HashSet<>();
            int count = 0;
            for(int j=i;j<n;j++){
                
                if(set.contains(s.charAt(j))){
                    break;
                }
                else{
                    set.add(s.charAt(j));
                    count++;
                    if(count>max) max = count;
                }

            }
        }
        return max;
    }
}