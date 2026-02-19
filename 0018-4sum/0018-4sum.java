class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1;j<n;){
                int k = j+1; int l = n-1;
                while(k < l){
                    long sum = (long)nums[i]+ (long)nums[j]+ (long)nums[k]+ (long)nums[l];
                    if(sum < target){
                        k++;
                    }else if(sum > target){
                        l--;
                    }
                    else{
                        res.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;l--;

                        while(k < l && nums[k] == nums[k-1]) k++;
                    }
    
                }
                j++;
                while(j<n && nums[j] == nums[j-1]) j++;
                //after this loop j++ will be done and will go to for loop then again j++ and we don't want that that's why above line 
            }
        }
        return res;
        
    }
}
-----------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (j != i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[l];
                    if (sum == target) {
                        List<Integer> ans = new ArrayList<>();
                        ans.add(arr[i]);
                        ans.add(arr[j]);
                        ans.add(arr[k]);
                        ans.add(arr[l]);
                        res.add(ans);
                        k++;
                        l--;

                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }
                        while (k < l && arr[l] == arr[l + 1]) {
                            l--;
                        }
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }

            }
        }
        return res;
    }
}
