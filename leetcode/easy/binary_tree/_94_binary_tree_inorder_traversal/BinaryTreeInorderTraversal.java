package easy.binary_tree._94_binary_tree_inorder_traversal;

import javax.swing.tree.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

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
