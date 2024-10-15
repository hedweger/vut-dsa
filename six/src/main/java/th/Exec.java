/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package th;

/**
 *
 * @author th
 */
public class Exec {

    public static void main(String[] args) {
        BinTree bt = new BinTree();
        bt.add(10);
        bt.add(9);
        bt.add(11);
        bt.print();
        System.out.println(bt.contains(11));
        System.out.println(bt.contains(9));
    }
}
