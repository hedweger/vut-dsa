/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package th;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

public class GrafSearch {

    public static void main(String[] args) {
        // System.out.println("First example:");
        // P01Move();
        // System.out.println("Fourth example");
        // P04Cloning2();
        // System.out.println("Sixth example");
        // P06TreeSet();
        // System.out.println("Seventh example");
        // P07HashSet();
        // System.out.println("Eighth example");
        // P08Queue();
        // System.out.println("Ninth example");
        // P09PrintSolution();
        P10BFS();
    }

    private static void P10BFS() {
        Board h = new Board();
        // TODO: vytvorit nahodne hraci pole (viz priklad P2Randomize) => DONE
        Random rnd = new Random();
        for (int i = 0; i < 100000; i++) {
            int nahodne = rnd.nextInt(4);
            h.move(1 + nahodne);
        }
        BFS bfs = new BFS();
        bfs.printMoves(h);
    }

    private static void P09PrintSolution() {
        var h = new Board();
        System.out.println("" + h + h.isSolution());

        System.out.println(); // odradkuj
        h = h.cloneAndMove(Board.UP);
        h = h.cloneAndMove(Board.DOWN);
        h = h.cloneAndMove(Board.LEFT);
        h = h.cloneAndMove(Board.RIGHT);
        System.out.println("" + h + h.isSolution());
    }

    private static void P08Queue() {
        var h1 = new Board();
        var h2 = new Board();
        h2 = h2.cloneAndMove(Board.UP);

        var fronta = new LinkedList<Board>();
        fronta.addLast(h1);
        fronta.addLast(h2);

        // TODO: v cyklu postupne odstranit prvky ze zacatku a vypsat je.
        while (!fronta.isEmpty()) {
            System.out.println(fronta.getFirst());
            fronta.removeFirst();
        }
    }

    private static void P07HashSet() {
        var g1 = new Board();

        // Vytvor mnozinu a pridej
        var set = new HashSet<Board>();
        set.add(g1);

        // Pridej do mnoziny
        var g2 = g1.cloneAndMove(Board.UP);
        g2.move(Board.UP);
        set.add(g2);

        // new code
        set.contains(g2); // returns true

        System.out.println("Pocet prvku v mnozine je: " + set.size() + "\n" + set);
    }

    private static void P06TreeSet() {
        var g1 = new Board();

        // Vytvor mnozinu a pridej
        var set = new TreeSet<Board>();
        set.add(g1);

        // Pridej do mnoziny
        var g2 = g1.cloneAndMove(Board.UP);
        g2.move(Board.DOWN);
        set.add(g2);

        // new code
        set.contains(g2); // returns false

        System.out.println("Pocet prvku v mnozine je: " + set.size() + "\n" + set);
    }

    private static void P05IsSolution() {
        var h = new Board();
        System.out.println("" + h + h.isSolution());

        System.out.println(); // odradkuj
        h.move(Board.LEFT);
        System.out.println("" + h + h.isSolution());
    }

    private static void P04Cloning2() {
        var g = new Board();
        System.out.println("Original: \n" + g);

        for (int i = 1; i <= 4; i++) {
            var g3 = g.cloneAndMove(i);
            // new code
            if (g3 == null) {
                continue;
            }
            // end of new code
            System.out.println("Kopie s pohybem " + i + " je: \n" + g3);
        }
    }

    private static void P03Cloning() {
        Board g = new Board();
        System.out.println("Origina: \n" + g);

        var g3 = g.cloneAndMove(Board.UP);
        /*
         * // Vyzkousejte nahradit timto kodem predchozi radek a pozorujte efekt
         * HraciPole g3 = g;
         * g3.pohni(nahoru);
         * ANSWER: pokud tohle udelame, nebud g3 kopie, ale reference na originalni g a
         * tim padem budou g a g3 identicke
         */
        System.out.println("Kopie s pohybem " + Board.UP + " je: \n" + g3);
    }

    private static void P02Randomize() {
        Board g = new Board();
        Random rnd = new Random();
        for (int i = 0; i < 100000; i++) {
            // nahodne cislo 0 - 3
            int nahodne = rnd.nextInt(4);
            g.move(1 + nahodne);
        }
        System.out.println(g);
    }

    private static void P01Move() {
        Board p = new Board();
        System.out.println(p);

        p.move(Board.UP);
        System.out.println(p);
    }

}
