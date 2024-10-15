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
        bt.add(7);
        bt.add(1);
        bt.add(5);
        bt.add(6);
        bt.add(14);
        bt.add(10);
        bt.add(16);
        bt.print_inorder();
        bt.print_preorder();
        bt.print_postorder();
        System.out.println(bt.contains(1));
        System.out.println(bt.contains(12));
        System.out.println(bt.contains(9));
        System.out.println(bt.contains(5));
    }
}
