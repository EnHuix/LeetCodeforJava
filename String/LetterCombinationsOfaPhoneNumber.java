/*
Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.

Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
*/

class Solution {
    public List<String> letterCombinations(String digits) {
    LinkedList<String> ans = new LinkedList<String>();
    if(digits.isEmpty()) return ans;
    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ans.add("");
    for(int i =0; i<digits.length();i++){
        int x = Character.getNumericValue(digits.charAt(i));
        while(ans.peek().length()==i){
            String t = ans.remove();
            for(char s : mapping[x].toCharArray())
                ans.add(t+s);
        }
    }
    return ans;
}
}
//注意该题解法
/*
peek()函数表示的是查看堆栈顶部的对象，但不从堆栈中移除它。
remove()为删去栈顶元素，并返回删去后的对象。若没有参数，则每次都从第一个元素开始删去。
remove()这个方法是一个重载方法，即remove(int position)和remove(object object)
使用remove()的方法时，要先从大到小的位置移除。当然如果你知道具体的对象，直接移除remove(对象)更稳妥。
要密切注意自己调用的remove()方法中的，传入的是int类型还是一个对象。 
*/ 
