package easy.binary_tree._100_same_tree;

public class SameTree {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Case 1: If p and q both are null -> Return true
        if (p == null && q == null) return true;

        // Case 2: If one of them is null -> Return false
        if (p == null || q == null) return false;

        // Case 3: Usual case mentioned in the question
        return compareNodes(p, q);
    }

    public boolean compareNodes(TreeNode tree1, TreeNode tree2) {

        // If both nodes are null -> Return true
        if (tree1 == null && tree2 == null) return true;

        // If one of them is null -> Return false
        if (tree1 == null || tree2 == null) return false;

        // If values are different -> Return false
        if (tree1.val != tree2.val) return false;

        // Check left and right subtree
        return compareNodes(tree1.left, tree2.left) && compareNodes(tree1.right, tree2.right);
    }
}
