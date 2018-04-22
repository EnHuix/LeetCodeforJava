/*
����һ���ĵ� (Unix-style) ����ȫ·���������·���򻯡�

���磬
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"

�߽����:

���Ƿ����� ·�� = "/../" �������
����������£����践�� "/" ��
���⣬·����Ҳ���ܰ������б�� '/' ���� "/home//foo/" ��
����������£���ɺ��Զ����б�ܣ����� "/home/foo" ��

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