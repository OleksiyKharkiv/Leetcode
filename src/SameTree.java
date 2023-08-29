public class SameTree {
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Если оба дерева пусты, они считаются одинаковыми
        if (p == null && q == null) {
            return true;
        }
        // Если одно из деревьев пустое, а другое - нет, они не одинаковы
        if (p == null || q == null) {
            return false;
        }
        // Проверяем значения узлов текущих деревьев и рекурсивно проверяем их поддеревья
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}