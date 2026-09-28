class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};    
    }
}


//SmartInterviews Solution
// int n = nums.length;
//         Arrays.sort(nums);
//         int l=0, r=n-1;
//         while(l<r){
//             if(nums[l] + nums[r] == target){
//                 return new int[]{l, r};
//             }else if(nums[l] + nums[r] > target){
//                 r--;
//             }else{
//                 l++;
//             }
//         }
//         return new int[]{};