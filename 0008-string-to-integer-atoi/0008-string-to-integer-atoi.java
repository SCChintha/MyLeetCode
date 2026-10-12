class Solution {
    public int myAtoi(String s) {
        // char[] ch = s.toCharArray();
        int n = s.length();

        //WhiteSpaces....
        int i=0;
        while(i<n && s.charAt(i)==' '){
            i++;
        }

        if(i==n){
            return 0;
        }
        //Sign Checkingg
        int sign = 1;
        if(s.charAt(i)=='+'){
            i++;
        }
        
        else if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }

        //Read Digits
        long result = 0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            result = result*10 + digit;

            if (sign * result <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (sign * result >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            i++;
        }
        //Sign apply chesi return chey
        return (int)(result*sign);
    }
}