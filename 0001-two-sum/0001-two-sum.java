class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = res[1] = -1;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            int needed = target - a;
            if(map.containsKey(needed)){
                res[0] = map.get(needed);
                res[1] = i;
                return res;
            }
             map.put(nums[i],i);


        }
        return res;
    }
}