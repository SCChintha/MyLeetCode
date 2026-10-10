class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int p1=0;
        int p2=0;
        int m = nums1.length;
        int n = nums2.length;
        // int[] mergedArr = new int[m+n];
        ArrayList<Integer> mergedArr = new ArrayList<>();
        while(p1<m && p2<n){
            if(nums1[p1]<nums2[p2]){
                mergedArr.add(nums1[p1]);
                p1++;
            }else{
                mergedArr.add(nums2[p2]);
                p2++;
            }
        }
        while(p1<m){
            mergedArr.add(nums1[p1]);
            p1++;
        }
        while(p2<n){
            mergedArr.add(nums2[p2]);
            p2++;
        }

        int middleIndex = mergedArr.size()/2;
        int size = mergedArr.size();
        if((size) % 2 == 0){
            return ((mergedArr.get(middleIndex) + mergedArr.get(middleIndex-1))/2.0);
        }else{
            return (mergedArr.get(middleIndex)/1.0);
        }

    }
}