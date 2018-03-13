/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/

//better method
public boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}

/*
class Solution {
    public boolean isValid(String s) {
        boolean res;
        Stack<Character> st=new Stack<Character>();
        int i=0;
        if(s.length()%2!=0)
            return false;
        while(i<s.length()){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
                st.push(s.charAt(i));
            else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
                if(!st.isEmpty()){
                    char t=st.pop();
                    if((s.charAt(i)-t)!=1&&(s.charAt(i)-t)!=2)
                        return false;
                }
            }
            i++;
        }
        if(!st.isEmpty())
            return false;
        return true;
    }
}
*/
//关于栈的性质