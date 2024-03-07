public class M1372LongestZigZagPathinaBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        int max = 0;

        public int longestZigZag(TreeNode root) {
            //if (root == null) return 0;
//            int max = Math.max(maxZigZag(root, "left"), maxZigZag(root, "right"));
//            if (max < longestZigZag(root.left)) max = longestZigZag(root.left);
//            if (max < longestZigZag(root.right)) max = longestZigZag(root.right);
            maxZigZag(root, "left", 0);
            maxZigZag(root, "left", 0);
            return max;
        }

        public void maxZigZag(TreeNode node, String direction, int currentLength) {
            if (node == null) return;
            max = Math.max(max, currentLength);
            if (direction.equals("left")) {
                //maxZigZag(node.left, "right") + 1 can't directly +1, the path may not be continuous
                // return Math.max(maxZigZag(node.left, "right") + 1, maxZigZag(node.right, "left"));
                maxZigZag(node.left, "right", currentLength + 1);
                maxZigZag(node.right, "left", 1);
            } else {
                maxZigZag(node.right, "left", currentLength + 1);
                maxZigZag(node.left, "right", 1);
            }
        }
    }
}
