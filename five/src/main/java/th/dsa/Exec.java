package th.dsa;
public class Exec {
    public static void main(String[] args) {
        Taylor.read("/Users/th/vut/dsa/five/src/main/java/th/dsa/input.txt");

        Lincoln linc = new Lincoln();
        Prez prez1 = new Prez(1);
        linc.push(prez1);
        Prez prez2 = new Prez(2);
        linc.push(prez2);
        Prez prez3 = new Prez(3);
        linc.push(prez3);
        Prez prez4 = new Prez(4);
        linc.push(prez4);
        Prez prez5 = new Prez(5);
        linc.push(prez5);
        System.out.println("Initial state: ");
        linc.print();
        linc.pop();
        System.out.println("After pop: ");
        linc.print();
        System.out.println("is empty? " + linc.isEmpty());
        System.out.println("contains 4? " + linc.contains(4));
        System.out.println("contains 5? " + linc.contains(5));
    }
}
