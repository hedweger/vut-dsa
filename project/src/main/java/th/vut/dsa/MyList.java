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
        var curr_last = this.last;
        var lc = new ListComponent(data, this.last.getRight(), null, this.parent);
        curr_last.setRight(lc);
        this.last = lc;
    }
    
    // TOHLE IGNORUJ!!
    public void walk() {
        var curr = this.first;
        while (curr != null) {
            curr.print();
            curr = curr.getRight();
        }
    }
}

