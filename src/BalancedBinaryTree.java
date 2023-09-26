public class BalancedBinaryTree {
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
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }

    private int checkBalance(TreeNode node) {
        if (node == null) {
            return 0; // Пустое поддерево считается сбалансированным.
        }

        int leftHeight = checkBalance(node.left);
        if (leftHeight == -1) {
            return -1; // Несбалансированное левое поддерево.
        }

        int rightHeight = checkBalance(node.right);
        if (rightHeight == -1) {
            return -1; // Несбалансированное правое поддерево.
        }

        // Проверяем баланс текущего узла.
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // Несбалансированное текущее поддерево.
        }

        return Math.max(leftHeight, rightHeight) + 1; // Возвращаем высоту текущего поддерева.
    }
}