package th;

public class BinTree {
    private TreeNode head;

    public boolean contains(int comp) {
        return this.head.contains(comp);
    }

    public void add(int new_value) {
        if (this.head == null) {
            this.head = new TreeNode(new_value);
            return;
        }
        TreeNode current = this.head;
        if (current.value > new_value) {
            if (current.getLeft() != null) {
                current = current.getLeft();
            } else {
                current.setLeft(new TreeNode(new_value));
            }
        } else if (current.value < new_value) {
            if (current.getRight() != null) {
                current = current.getRight();
            } else {
                current.setRight(new TreeNode(new_value));
            }
        }
    }

    public void print() {
        // does java have a pass by reference thing? this copies a bunch of buffers around, right?
        String buffer = String.valueOf(this.head.value);
        buffer = this.print_left(buffer);
        buffer = this.print_right(buffer);
        System.out.println(buffer);
    }

    private String print_right(String buffer) {
        TreeNode current = this.head.getRight();
        // get left
        while (current != null) {
           buffer = buffer + "->" + current.value;
           current = current.getRight(); 
        }
        return buffer;
    }
    private String print_left(String buffer) {
        TreeNode current = this.head.getLeft();
        // get left
        while (current != null) {
           buffer = current.value + "<-" + buffer;
           current = current.getLeft(); 
        }
        return buffer;
    }

    public TreeNode getHead() {
        return head;
    }

    public void setHead(TreeNode head) {
        this.head = head;
    }
}
