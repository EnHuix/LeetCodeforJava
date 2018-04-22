/*
给定一个文档 (Unix-style) 的完全路径，请进行路径简化。

例如，
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"

边界情况:

你是否考虑了 路径 = "/../" 的情况？
在这种情况下，你需返回 "/" 。
此外，路径中也可能包含多个斜杠 '/' ，如 "/home//foo/" 。
在这种情况下，你可忽略多余的斜杠，返回 "/home/foo" 。

*/


class Solution {
   public static String simplifyPath(String path) {
            Deque<String> stack = new LinkedList<>();
		    Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
		    for (String dir : path.split("/")) {
		        if (dir.equals("..") && !stack.isEmpty()) stack.pop();
		        else if (!skip.contains(dir)) stack.push(dir);
		    }
		    String res = "";
		    for (String dir : stack) res = "/" + dir + res;
		    return res.isEmpty() ? "/" : res;
            
    }
}