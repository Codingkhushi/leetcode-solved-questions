class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            char currF = s.charAt(l);
            char currL = s.charAt(r);
            if(!Character.isLetterOrDigit(currF)){
                l++;
            }else if(!Character.isLetterOrDigit(currL)){
                r--;
            }else{
                if(Character.toLowerCase(currF) != Character.toLowerCase(currL)){
                    return false;
                }
                l++;
                r--;
            }
        }


        return true;
        
    }
}