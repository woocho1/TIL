package week02.binarytree;


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    public int maxDepth(TreeNode root) {
        return findDepth(root, 0);
    }

    int findDepth(TreeNode node, int currDepth) {
        if(node==null) {
            return 0;
        }
        currDepth++;
        return 1 + Math.max(findDepth(node.left, currDepth), findDepth(node.right, currDepth));
    }

}

public class BinaryTree {


}
