package org.th.first_dsa;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author th
 */
public class First {
    public static void main(String[] args) throws IOException{
        System.out.println("Working Directory: " + System.getProperty("user.dir"));

        FileReader fr = new FileReader("text.txt");

        int i;
        int letters = 0;
        int words = 0;
        while ((i = fr.read()) != -1) {
            char c = (char)i;
            if (Character.isAlphabetic(c)) {
                letters++;
            } else if (Character.isWhitespace(c)) {
                words++;
            }
        }
        fr.close();
        System.err.println("Number of chars is: " + letters);
        System.err.println("Number of words is: " + words+1);

        // Priklad 2 
        System.out.println("Priklad 2:");
        Map map = new Map();
        for (int j = 0; j < 10; j++) {
            Car car = new Car("auto " + j, j, j);
            map.cars.addElement(car);
        }
        map.cars.forEach(c -> System.out.println(c.name));
        // Priklad 3
        System.out.println("Priklad 3/4:");
        Packet p1 = new Packet("prvni");
        Packet p2 = new Packet("druhy");
        Packet p3 = new Packet("treti");
        Packet p4 = new Packet("ctvrty");
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        // Priklad 4
        p4.next = p1;
        System.out.println(p1.name + " points to " + p1.next.name + " points to " + p1.next.next.name + " points to " + p1.next.next.next.name);
        //Priklad 5
        System.out.println("Priklad 5:");
        Folder f1 = new Folder("home");
        Folder f2 = new Folder("user1");
        Folder f3 = new Folder("user2");
        Folder f4 = new Folder("subuser1");
        Folder f5 = new Folder("subuser2");
        f1.subfolder.addElement(f2);
        f1.subfolder.addElement(f3);
        f3.subfolder.addElement(f4);
        f3.subfolder.addElement(f5);
    }
}