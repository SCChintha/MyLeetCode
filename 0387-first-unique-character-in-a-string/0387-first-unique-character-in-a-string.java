class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        char[] ch = s.toCharArray();

        for(int i=0;i<s.length();i++){
            if(freq.containsKey(ch[i])){
                freq.put(ch[i], freq.get(ch[i]) + 1);
            }else{
                freq.put(ch[i], 1);
            }
        }
        

        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;  
        
    }
}