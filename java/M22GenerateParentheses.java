import java.util.ArrayList;
import java.util.List;

public class M22GenerateParentheses {
    // Solution 1: Backtracking
    public List<String> generateParenthesisBT(int n) {
        List<String> ans = new ArrayList<String>();
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur.toString());
            return;
        }
        if (open < max) {
            cur.append('(');
            backtrack(ans, cur, open + 1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close < open) {
            cur.append(')');
            backtrack(ans, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }

    // Solution 2: Closure Number
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return res;
        }
        getParenthesis("", n, n);
        return res;
    }

    private void getParenthesis(String str, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }
        if (left == right) {
            //剩余左右括号数相等，下一个只能用左括号
            getParenthesis(str + "(", left - 1, right);
        } else if (left < right) {
            //剩余左括号小于右括号，下一个可以用左括号也可以用右括号
            if (left > 0) {
                getParenthesis(str + "(", left - 1, right);
            }
            getParenthesis(str + ")", left, right - 1);
        }
    }
}
