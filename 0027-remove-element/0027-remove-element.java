class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        
        while (i < n) {
            if (nums[i] == val) {
                // Shift all elements to the left by 1
                for (int j = i; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                n--; // Reduce effective array size
            } else {
                i++;
            }
        }
        return n;
    }
}

// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int k = 0; // Pointer for non-val elements

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != val) {
//                 nums[k] = nums[i];
//                 k++;
//             }
//         }

//         return k;
//     }
// }