class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int v=0;
        long tot=0;
        long curr=0;
        for(int num : nums){
            if(num>=minK && num<=maxK){
                curr++;
            }else{
                tot+=(curr*(curr+1))/2;
                curr=0;
            }
        }
        tot+=(curr*(curr+1))/2;
        return tot;
        
    }
}