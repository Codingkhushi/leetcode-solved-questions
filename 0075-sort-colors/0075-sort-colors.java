










class Solution {
    public void sortColors(int[] nums) {
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) countZero++;
            else if(nums[i] == 1) countOne++;
            else countTwo++;
        }
        int idx = 0;
        for(int i=0;i<countZero;i++){
            nums[idx++] = 0;
        }
        for(int i=0;i<countOne;i++){
            nums[idx++] = 1;
        }
        for(int i=0;i<countTwo;i++){
            nums[idx++] = 2;
        }
        
    }
}
