package th.dsa;

public class Lincoln {
    private Prez head;

    public Prez getHead() {
        return head;
    }

    public void setHead(Prez head) {
        this.head = head;
    }
    
    public void push(Prez newp) {
        if (this.head == null) {
            this.head = newp;
            return;
        }
        newp.setNext(this.head);
        this.head = newp;
    }

    public Prez pop() {
        Prez slain = this.head;
        this.head = this.head.getNext();
        return slain;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public boolean contains(int val) {
        Prez suspect = this.head;
        while (suspect != null) {
            if (suspect.getVal() == val) {
                return true;
            }
            suspect = suspect.getNext();
        }
        return false;
    }

    public void print() {
        int idx = 1;
        Prez suspect = this.head;
        while (suspect != null) {
            System.out.println("Item n: " + idx + ", val: " + suspect.getVal());
            idx++;
            suspect = suspect.getNext();
        }
    }
}
