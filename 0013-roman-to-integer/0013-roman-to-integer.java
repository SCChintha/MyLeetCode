class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = getValue(s.charAt(i));

            // If a smaller value comes before a larger value, subtract it (e.g., IV -> 5 - 1 = 4)
            if (currentValue < prevValue) {
                ans -= currentValue;
            } else {
                ans += currentValue;
            }

            prevValue = currentValue;
        }

        return ans;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}