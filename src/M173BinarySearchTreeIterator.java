import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class M173BinarySearchTreeIterator {
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
    }

    class BSTIterator {
        int pointer;
        List<Integer> list = new ArrayList<>();

        public BSTIterator(TreeNode root) {
            list.add(root.val);
            traverse(root);
            Collections.sort(list);
            pointer = -1;
        }
        public void traverse(TreeNode root) {
            if (root.left != null) {
                list.add(root.left.val);
                traverse(root.left);
            }
            if (root.right != null) {
                list.add(root.right.val);
                traverse(root.right);
            }
        }

        public int next() {
            pointer++;
            return list.get(pointer);
        }

        public boolean hasNext() {
            return !(pointer >= list.size() - 1);
        }
    }
///
//  Your BSTIterator object will be instantiated and called as such:
//  BSTIterator obj = new BSTIterator(root);
//  int param_1 = obj.next();
//  boolean param_2 = obj.hasNext();
// /
}
