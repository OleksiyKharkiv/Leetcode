import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> listPreorder = new ArrayList<>();
        preorderTraversal (root, listPreorder);
        Collections.reverse(listPreorder);
        return listPreorder;
    }
    private void preorderTraversal(TreeNode node, List<Integer> list){
        if (node != null){
            list.add(node.val);
            preorderTraversal(node.left, list);
            preorderTraversal(node.right, list);
        }
    }
}