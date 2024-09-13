class Solution {
    int maxlen = 0;
    int lo = 0;
    public String longestPalindrome(String s) {
        char[] inp = s.toCharArray();
        if(s.length()<2){
            return s;
        }
        for(int i=0;i<inp.length;i++){
            expand(inp,i,i);
            expand(inp,i,i+1);
        }
        return s.substring(lo,lo+maxlen);
        
    }
    public void expand(char[] s,int j,int k){
        while(j>=0 && k<s.length && s[j] == s[k]){
            j--;
            k++;
        }
        if(maxlen<k-j-1){
            maxlen = k-j-1;
            lo=j+1;
        }
    }
}