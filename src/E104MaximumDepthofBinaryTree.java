
import java.util.Stack;

public class E104MaximumDepthofBinaryTree {
    class Solution {


        public int maxDepthRecursive(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(maxDepthRecursive(root.left), maxDepthRecursive(root.right));
        }

        public int maxDepthNon(TreeNode root) {
            if (root == null) return 0;
            int max = 1;

            Stack<TreeNode> nodes = new Stack<>();
            Stack<Integer> depths = new Stack<>();

            nodes.push(root);
            depths.push(1);

            while (!nodes.empty()) {
                TreeNode curr = nodes.pop();
                int depth = depths.pop();

                if (curr.left == null && curr.right == null) {
                    max = Math.max(max, depth);
                }

                if (curr.right != null) {
                    nodes.push(curr.right);
                    depths.push(depth + 1);
                }
                if (curr.left != null) {
                    nodes.push(curr.left);
                    depths.push(depth + 1);
                }
            }

            return max;

        }
    }


}
