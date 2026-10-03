class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> seen = new HashSet<>();
        char[] ch = s.toCharArray();

        for(int i=0; i<s.length(); i++){
            //char c = s.charAt(i);
            if(seen.contains(ch[i])){
                return ch[i];
            }else{
                seen.add(ch[i]);
            }
        }
        return ' ';
    }
}