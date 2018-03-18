/*
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]

*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> res=new HashMap<String,List<String>>();
        for(String str:strs){
            char[] a=str.toCharArray();
            Array.sort(a);
            String keyStr=String.valueOf(a);
            if(!res.containsKey(keyStr))
                res.put(keyStr,new ArrayList<String>());
            res.get(keyStr).add(str);
        }
        return new ArrayList<List<String>>(res.values());
    }
  
}
