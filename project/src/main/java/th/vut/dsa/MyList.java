package th.vut.dsa;

public class MyList {
    // parent component is unchanged
    private ListComponent parent = new ListComponent("S", null, null, null);
    private ListComponent first;
    private ListComponent last;

    public MyList() {
        var lc = new ListComponent("A", null, null, this.parent);
        this.first = lc;
        this.last = lc;
    }

    public void insert(String data) {
        var lc = new ListComponent(data, this.last, null, this.parent);
        if (this.last != null) {
            this.last.setRight(lc);
        }
        this.last = lc;
    }


    public void swap_every_second() {
        if (this.first == this.last) {
            return;
        }
        var current = this.first;
        while (current != null && current.getRight() != null) {
            var next = current.getRight(); 

            current.setRight(next.getRight());
            next.setLeft(current.getLeft());

            if (current.getLeft() != null) {
                current.getLeft().setRight(next);
            } else {
                this.first = next;
            }

            if (next.getRight() != null) {
                next.getRight().setLeft(current);
            } else {
                this.last = current;
            }

            next.setRight(current);
            current.setLeft(next);

            current = current.getRight();
        }
    }
   
    // utilitka na vypis
    public void walk() {
        var curr = this.first;
        while (curr != null) {
            curr.print();
            curr = curr.getRight();
        }
    }

}

