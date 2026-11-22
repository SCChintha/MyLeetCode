class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(arr[i])) {
                return true;
            }
            hs.add(arr[i]);
            if (hs.size() > k) {
                hs.remove(arr[i - k]);
            }
        }
        return false;
    }
}