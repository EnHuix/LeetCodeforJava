//Given "abcabcbb", the answer is "abc", which the length is 3.

//Given "bbbbb", the answer is "b", with the length of 1.

//Given "pwwkew", the answer is "wke", with the length of 3. 
//Note that the answer must be a substring, "pwke" is a subsequence and not a substring.



class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=1;
        int max=res;
        Boolean flag;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                flag=false;
                for(int k=i;k<j;k++){
                        if(s.charAt(k)==s.charAt(j)){
                        flag=true;
                        break;
                    }
                }
                    if(flag)
                        break;
                   else
                        max++;
                           
            }
            if(max>res)
                res=max;
            max=1;
        }
        if(s.length()==0)
            res=0;
        return res;
    }
}

//better methods
/*public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    } 
}*/ 
