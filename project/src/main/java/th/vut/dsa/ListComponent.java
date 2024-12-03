package th.vut.dsa;

public class ListComponent {
    private String data;
    private ListComponent left;
    private ListComponent right;
    private ListComponent parent;
    
    public ListComponent(String data, ListComponent left, ListComponent right, ListComponent parent) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }
    public void print() {
        System.out.println("Parent data is: " + this.parent.data);
        System.out.println("My data is: " + this.data);
        if (this.left == null) {
            System.out.println("Left data is: null");
        } else {
            System.out.println("Left data is: " + this.left.data);
        }
        if (this.right == null) {
            System.out.println("Right data is: null");
        } else {
            System.out.println("Right data is: " + this.right.data);
        }
        System.out.println("");
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public ListComponent getLeft() {
        return left;
    }
    public void setLeft(ListComponent left) {
        this.left = left;
    }
    public ListComponent getRight() {
        return right;
    }
    public void setRight(ListComponent right) {
        this.right = right;
    }
    public ListComponent getParent() {
        return parent;
    }
    public void setParent(ListComponent parent) {
        this.parent = parent;
    }

    
}
