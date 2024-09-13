class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> map = new HashMap<>();
       for(String s : strs){
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String sorted = new String(s1);
        if(!map.containsKey(sorted)){
            map.put(sorted,new ArrayList<>());
        }
        map.get(sorted).add(s);
       }
       return new ArrayList<>(map.values());
    }
}