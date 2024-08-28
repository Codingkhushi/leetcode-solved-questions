class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int temp = sum - k;
            if(map.containsKey(temp)){
                cnt += map.get(temp);
            }
                map.put(sum,map.getOrDefault(sum,0)+1);
            
        }
        return cnt;

    }
}