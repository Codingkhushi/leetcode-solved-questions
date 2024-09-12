class Solution {
    public int characterReplacement(String s, int k) {
        int arr[] = new int[26];
        int l = 0;
        int maxlen = 0,len = 0;
        for(int r=0;r<s.length();r++){
            arr[s.charAt(r)-'A']++;
            len = Math.max(len,arr[s.charAt(r)-'A']);
            if(r-l+1-len>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
  
}