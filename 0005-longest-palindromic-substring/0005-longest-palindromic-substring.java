class Solution {
    int maxlen = 0;
    int start = 0;
    public String longestPalindrome(String s) {
        char[] s1 = s.toCharArray();
        for(int i=0;i<s1.length;i++){
            expandfromcentre(s1,i,i);
            expandfromcentre(s1,i,i+1);

        }
        return s.substring(start,start+maxlen);
    }
    public void expandfromcentre(char s[],int j,int k){
        while(j>=0 && k<s.length && s[j]==s[k]){
            j--;
            k++;
        }
        if(maxlen < k-j-1){
            maxlen = k-j-1;
            start = j+1;
        }

    }
}