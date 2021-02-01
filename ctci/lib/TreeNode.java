package ctci.lib;

public class TreeNode {

    public int data;
    public TreeNode parent;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int d) {
        this.data = d;
        left = null;
        right = null;
    }

    public void setLeft(TreeNode node) {
        this.left = node;
        if(node != null) {
            this.left.parent = this;
        }
    }

    public void setRight(TreeNode node) {
        this.right = node;
        if(node != null) {
            this.right.parent = this;
        }
    }

    public void insert(int val) {
        if(val <= data) {
            if(this.left == null) {
                this.setLeft(new TreeNode(val));
            } else {
                this.left.insert(val);
            }
        } else {
            if(this.right == null) {
                this.setRight(new TreeNode(val));
            } else {
                this.right.insert(val);
            }
        }
    }

    public TreeNode find(int val) {
        if(val == data) {
            return this;
        } else if(val < data) {
            return left != null ? left.find(val) : null;
        } else if(val > data) {
            return right != null ? right.find(val) : null;
        }
        return null;
    }
    
}
