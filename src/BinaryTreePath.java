import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        findPaths(root, "", res);
        return res;
    }

    private void findPaths(TreeNode node, String path, List<String> res) {
        if (node == null) {
            return;
        }
        path += Integer.toString(node.val);
        if (node.left == null && node.right == null) {
            res.add(path);
        } else {
            path += "->";
            findPaths(node.left, path, res);
            findPaths(node.right, path, res);
        }
    }
}