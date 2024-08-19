class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length; // size of the given array.
        HashMap<Integer,Integer> mpp= new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            // add current element to prefix Sum:
            preSum += arr[i];

            if(mpp.containsKey(preSum - k)){
                cnt += mpp.get(preSum - k);
            }

            
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}