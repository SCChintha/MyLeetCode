class Solution {
    public boolean searchMatrix(int[][] mat, int key) {
        int n = mat.length;
        int m = mat[0].length;

        int i = 0;
        int j = m-1;

        int ptr = mat[i][j];
        while(j>=0 && i<n){
            ptr = mat[i][j];
            if(ptr == key){
                return true;
            }else if(ptr > key){ //Skipping down elements and check left
                j--;
            }else{
                i++; //Skipping left elements and check down
            }
        }
        return false;
    }
}