class Solution {
    public int hammingDistance(int x, int y) {
        // int res = x^y;
        // int count=0;
        // while(res>0){

        // }
        return Integer.bitCount(x ^ y);
    }
}