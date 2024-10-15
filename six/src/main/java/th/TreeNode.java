package th;

public class TreeNode {
    private TreeNode left;
    public int value;
    private TreeNode right;

    public void print_preorder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        print_preorder(node.left);
        print_preorder(node.right);
    }

    public void print_postorder(TreeNode node) {
        if (node == null)
            return;
        print_postorder(node.left);
        print_postorder(node.right);
        System.out.print(node.value + " ");
    }

    public void print_inorder(TreeNode node) {
        if (node == null)
            return;
        print_inorder(node.left);
        System.out.print(node.value + " ");
        print_inorder(node.right);
    }
    public boolean contains(int comp, Boolean res) {
        if (this.value == comp) {
            res = true;
        }
        if (this.left != null) {
            res = left.contains(comp, res);
        }
        if (this.right != null) {
            res = right.contains(comp, res);
        }
        return res;
    }

    public void add(int val) {
        if (val < this.value) {
            if (this.left == null) {
                this.left = new TreeNode(val);
            } else {
                this.left.add(val);
            }
        }else if (val > this.value) {
            if (this.right == null) {
                this.right = new TreeNode(val);
            } else {
                 this.right.add(val);
            }
        }
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
