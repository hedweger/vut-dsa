package th;

public class TreeNode {
    private TreeNode left;
    public int value;
    private TreeNode right;

    public boolean contains(int comp) {
        if (this.value == comp) {
            return true;
        }
        if (this.left != null) {
            return left.contains(comp);
        }
        if (this.right != null) {
            return right.contains(comp);
        }
        return false;
    }

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
    
}
