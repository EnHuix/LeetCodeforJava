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
//ע�����ⷨ
/*
peek()������ʾ���ǲ鿴��ջ�����Ķ��󣬵����Ӷ�ջ���Ƴ�����
remove()Ϊɾȥջ��Ԫ�أ�������ɾȥ��Ķ�����û�в�������ÿ�ζ��ӵ�һ��Ԫ�ؿ�ʼɾȥ��
remove()���������һ�����ط�������remove(int position)��remove(object object)
ʹ��remove()�ķ���ʱ��Ҫ�ȴӴ�С��λ���Ƴ�����Ȼ�����֪������Ķ���ֱ���Ƴ�remove(����)�����ס�
Ҫ����ע���Լ����õ�remove()�����еģ��������int���ͻ���һ������ 
*/