/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.th.second;

/**
 *
 * @author th
 */
public class Exec {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();

        numbers.print();
        System.out.println("");

        numbers.move(1);
        numbers.print();
        System.out.println("");

        numbers.move(2);
        numbers.print();
        System.out.println("");

        numbers.move(3);
        numbers.move(3);
        numbers.print();
        System.out.println("");

        numbers.move(4);
        numbers.print();
        System.out.println("");

        System.out.println("Winning location:");
        numbers.move(1);
        numbers.move(4);
        numbers.print();
    }
}
