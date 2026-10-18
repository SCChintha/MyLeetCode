class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;
        int i = n-1;

        while(i>=0){
            if (arr[i] != 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;

            i--;
        }
        int[] res = new int[arr.length + 1];
        res[0] = 1;

        return res;
    }
}