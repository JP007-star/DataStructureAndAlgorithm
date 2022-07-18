package problems;

public class ValidateBinarySearch {

    public static void main(String[] args) {

    }

    //Definition for a binary tree node.
    public class TreeNode {
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
        public boolean isValidBST(TreeNode root) {

            return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
        }
        public boolean valid(TreeNode root,long min,long max){
            if(root==null)   return true;  // base code

            if(min<root.val && max>root.val){
                return valid(root.left,min,root.val) && valid(root.right,root.val,max);
            }
            return false;
        }
    }
}

/*
https://leetcode.com/problems/validate-binary-search-tree/
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 */
