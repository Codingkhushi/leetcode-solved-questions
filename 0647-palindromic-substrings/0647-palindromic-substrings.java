class Solution {
    public int countSubstrings(String s) {
        //brute force
        // int res = 0;
        // int n = s.length();
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         if(palindrome(s,i,j)) res++;
        //     }
        // }
        // return res;
        int n = s.length();
        boolean palindrome[][] = new boolean[n][n];
        int res = 0;
        // for 1 character
        // for(int i=0;i<n;i++){
        //     palindrome[i][i] = true;
        //     res++;
        // }
        //for 2 characters
        // for(int i=0;i<n-1;i++){
        //     if(s.charAt(i)==s.charAt(i+1)){
        //         plaindrome[i][i+1] = true;
        //         res++;
        //     }
        // }
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                if(s.charAt(j)==s.charAt(j+i-1) && ((i<=2) || palindrome[j+1][j+i-2])){
                    palindrome[j][j+i-1] = true;
                    res++;
                }
            }
        }
        return res;
    }
    // public boolean palindrome(String s,int l,int r){
    //     while(l<r){
    //         if(s.charAt(l++) != s.charAt(r--)) return false;
    //     }
    //     return true;
    // }
}