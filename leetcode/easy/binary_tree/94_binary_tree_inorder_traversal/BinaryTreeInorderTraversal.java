import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class BinaryTreeInorderTraversal {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    inorderDfs(root, result);
    return result;
  }

  private void inorderDfs(TreeNode currentNode, List<Integer> inorderValues) {
    // Case 1: Null node -> stop.
    if (currentNode == null) return;

    // Case 2: Left -> Node -> Right
    inorderDfs(currentNode.left, inorderValues);
    inorderValues.add(currentNode.val);
    inorderDfs(currentNode.right, inorderValues);
  }
}
