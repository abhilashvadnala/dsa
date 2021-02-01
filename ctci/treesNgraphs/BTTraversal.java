package ctci.treesNgraphs;

import ctci.lib.TreeNode;

public class BTTraversal {

    public void print(TreeNode n) {
        if(n != null)
            System.out.println(n.data);
    }

    public void inOrder(TreeNode node) {
        if(node.left != null) inOrder(node.left);
        print(node);
        if(node.right != null) inOrder(node.right);
    }

    public void preOrder(TreeNode node) {
        print(node);
        if(node.left != null) preOrder(node);
        if(node.right != null) preOrder(node);
    }

    public void postOrder(TreeNode node) {
        if(node.left != null) postOrder(node.left);
        if(node.right != null) postOrder(node.right);
        print(node);
    }
    
}
