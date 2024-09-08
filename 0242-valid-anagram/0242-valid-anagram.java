class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(char x : s.toCharArray()){
        //     map.put(x,map.getOrDefault(x,0)+1);
        // }
        // for(char x : t.toCharArray()){
        //     map.put(x,map.getOrDefault(x,0)-1);
        // }
        // for(int c : map.values()){
        //     if(c!=0){
        //         return false;
        //     }
        // }

        if(s.length() != t.length()) return false;
        int charCount[] = new int[26]; 
        for(int i=0;i<s.length();i++){
            charCount[s.charAt(i)-'a']++;
            charCount[t.charAt(i)-'a']--;
        }
        for(int c : charCount ){
            if(c!=0) {
                return false;
            }
        }
        return true;
    }
}