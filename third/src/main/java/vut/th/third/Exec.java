/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vut.th.third;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author th
 */
public class Exec{

    public static void main(String[] args) {
        // 1
        Canvas konev = new Canvas(69, 420);
        konev.addObject(new Circle(25, 05, 2001));
        konev.addObject(new Square(2001, 05, 25));
        konev.createRaster();
        // 2
        Numbers n1 = new Numbers();
        Numbers n2 = new Numbers();
        n1.move(1);
        // n2.move(1);

        HashSet<Numbers> hash_mnozisko = new HashSet<>();
        TreeSet<Numbers> mnozisko = new TreeSet<>();
        hash_mnozisko.add(n1);
        hash_mnozisko.add(n2);
        mnozisko.add(n1);
        mnozisko.add(n2);

        System.out.println("hash: " + n1.hashCode());
        System.out.println("hash: " + n2.hashCode());

        System.out.println("n1 equals n1? " + n1.equals(n2));
        System.out.println("n2 equals n1? " + n2.equals(n1));
        System.out.println("n1 compareTo n2? " + n1.compareTo(n2));
        System.out.println("n2 compareTo n1? " + n2.compareTo(n1));

        System.out.println("hash_mnozina size: " + hash_mnozisko.size());
        System.out.println("mnozina size: " + mnozisko.size());

        System.out.println("Tomas Hadwiger se jmenuju :)");
    }
}
