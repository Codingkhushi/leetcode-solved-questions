//Dutch National Flag Algo
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
                 
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,high,mid);
                high--;
            }

        }
        
    }
    private void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

------------------------------------
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
