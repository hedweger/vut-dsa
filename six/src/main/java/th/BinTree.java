package cviok;

public class BinTree {
    private TreeNode head;

    public boolean contains(int comp) {
        Boolean res = false;
        return this.head.contains(comp, res);
    }

    public void add(int new_value) {
        if (this.head == null) {
            this.head = new TreeNode(new_value);
            return;
        }
        this.head.add(new_value);
    }
	public void print_leaves() {
		System.out.print("leaves: ");
        this.head.print_leaves(this.head);
        System.out.println("");
    }
    public void print_preorder() {
        System.out.print("pre-order: ");
        this.head.print_preorder(this.head);
        System.out.println("");
    }
    public void print_inorder() {
        System.out.print("in-order: ");
        this.head.print_inorder(this.head);
        System.out.println("");
    }
    public void print_postorder() {
        System.out.print("post-order: ");
        this.head.print_postorder(this.head);
        System.out.println("");
    }
    public TreeNode getHead() {
        return head;
    }
    public void setHead(TreeNode head) {
        this.head = head;
    }
}
