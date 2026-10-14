class Solution {
    public boolean searchMatrix(int[][] mat, int key) {
        int n = mat.length;
        int m = mat[0].length;

        int l = 0;
        int h = (n*m)-1;

        while(l<=h){
            //use binary search...
            int mid = (l+h)/2;
            //placing at exact position, calculate r and c
            int r = mid/m;
            int c = mid%m;
            
            if(mat[r][c] == key){
                return true;
            }else if(mat[r][c] > key){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;
    }
}