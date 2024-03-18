import java.util.LinkedList;
import java.util.Queue;


public class M1161MaximumLevelSumBinaryTree {
    public int maxLevelSum(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int maxLevel = 0, level = 0, max = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            int sum = 0;
            int size = queue.size();
            level++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            if (sum > max) {
                max = sum;
                maxLevel = level;
            }
        }
        return maxLevel;
    }
}
