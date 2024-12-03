package th.vut.dsa;

public class Exec {
    public static void main(String[] args) {
        var ml = new MyList();

        ml.insert("C");
        ml.insert("D");
        ml.insert("X");
        ml.insert("K");
        ml.insert("B");
        ml.insert("P");
        ml.insert("L");
        
        ml.walk();
    
        ml.swap_every_second();
        System.out.println("Swapuji kazde druhe!");

        ml.walk();
    }
}
