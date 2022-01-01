package com.company;

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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
      if (p == null && q == null) {
          return true;
      }
      if (p == null || q == null){
          return false;
      }
      if (p.val != q.val){
          return false;
      }
      return isSameTree(p.right,q.right) &&  isSameTree(p.left,q.left);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 12;
        treeNode.left = treeNode;
        treeNode.right = treeNode;
        TreeNode treeNode2 = new TreeNode();
        treeNode2.val = 12;
        treeNode2.left = treeNode;
        treeNode2.right = treeNode;

        System.out.println(isSameTree(treeNode, treeNode2));
    }
}
