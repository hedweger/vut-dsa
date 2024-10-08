package th.dsa;

public class Prez {
    private int val;
    private Prez next;

    public Prez(int val) {
        this.val = val;
    }

    public Prez getNext() {
        return next;
    }

    public void setNext(Prez next) {
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

}
