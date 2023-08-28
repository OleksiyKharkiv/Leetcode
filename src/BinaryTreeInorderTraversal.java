import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */


public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalHelper(root, result);
        return result;
    }

    private void inorderTraversalHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        inorderTraversalHelper(node.left, result);  // Рекурсивно обходим левое поддерево
        result.add(node.val);                      // Добавляем значение корня в список
        inorderTraversalHelper(node.right, result); // Рекурсивно обходим правое поддерево
    }
}