class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int lon = 0;int cnt = 0;
        int lastsmall = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1 == lastsmall){
                cnt += 1;
                lastsmall = nums[i];
            }else if(nums[i] != lastsmall){
                cnt = 1;
                lastsmall = nums[i];
            }
            lon = Math.max(lon,cnt);
        }
        return lon;
    }
}