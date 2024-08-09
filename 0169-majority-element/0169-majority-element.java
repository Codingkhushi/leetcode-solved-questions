class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     int val = map.getOrDefault(nums[i],0);
        //     map.put(nums[i],val+1);
        // }
        // for(Map.Entry<Integer,Integer> m : map.entrySet()){
        //     if(m.getValue() > (nums.length /2)){
        //         return m.getKey();
        //     }
        // }
        // return -1;


        int count = 0;
        int el=0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                count = 1;
                el = nums[i];
            }else if(nums[i] == el){
                count++;
            }else{
                count--;
            }
        }
        int c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == el) c++;
        }    
        if(c > (nums.length/2)) return el;
        return -1;
    }
}