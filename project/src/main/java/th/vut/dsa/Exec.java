package th.vut.dsa;

public class Exec {
    public static void main(String[] args) {
        var ml = new MyList();

        ml.insert("A");
        ml.insert("C");
        ml.insert("D");
        
        ml.walk();
    }
}
