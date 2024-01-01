import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal (TreeNode root){
        List<Integer> preorder = new ArrayList<>();
        preorderRecursive (root, preorder);
        return preorder;
    }
    private void preorderRecursive(TreeNode node, List<Integer> list){
        if (node != null) {
            list.add(node.val);
            preorderRecursive(node.left, list);
            preorderRecursive(node.right, list);
        }
    }
}