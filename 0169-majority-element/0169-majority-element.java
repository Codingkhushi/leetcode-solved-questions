class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val = map.getOrDefault(nums[i],0);
            map.put(nums[i],val+1);
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue() > (nums.length /2)){
                return m.getKey();
            }
        }
        return -1;
    }
}