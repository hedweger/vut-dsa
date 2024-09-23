package org.th.second;

import java.util.Vector;

public class Numbers {
    private int[][] gamefield;

    Numbers() {
        this.gamefield = new int[3][3];
        gamefield[0][0] = 7;
        gamefield[0][1] = 2;
        gamefield[0][2] = 4;
        gamefield[1][0] = 5;
        gamefield[1][2] = 6;
        gamefield[2][0] = 8;
        gamefield[2][1] = 3;
        gamefield[2][2] = 1;
    }

    public void print() {
        for (int i = 0; i < 3; i++) {
            System.out.println(gamefield[i][0] + " " + gamefield[i][1] + " " + gamefield[i][2]);
        }
    }

    private Vector<Integer> findZero() {
        Vector<Integer> pos = new Vector<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.gamefield[i][j] == 0) {
                    pos.add(i);
                    pos.add(j);
                }
            }
        }
        return pos;
    }

    public void move(int direction) {
        Vector<Integer> zero_pos = this.findZero();
        int old_num;
        switch (direction) {
            case 1: // up
                if (zero_pos.getFirst() == 0) {
                    System.out.println("Zero is already at the top");
                    return;
                }
                old_num = this.gamefield[zero_pos.getFirst() - 1][zero_pos.getLast()];
                this.gamefield[zero_pos.getFirst()][zero_pos.getLast()] = old_num;
                this.gamefield[zero_pos.getFirst() - 1][zero_pos.getLast()] = 0;
                break;
            case 2: // down
                if (zero_pos.getFirst() == 2) {
                    System.out.println("Zero is already at the bottom");
                    return;
                }
                old_num = this.gamefield[zero_pos.getFirst() + 1][zero_pos.getLast()];
                this.gamefield[zero_pos.getFirst()][zero_pos.getLast()] = old_num;
                this.gamefield[zero_pos.getFirst() + 1][zero_pos.getLast()] = 0;
                break;
            case 3: // right 
                if (zero_pos.getLast() == 2) {
                    System.out.println("Zero is already at the right");
                    return;
                }
                old_num = this.gamefield[zero_pos.getFirst()][zero_pos.getLast() + 1];
                this.gamefield[zero_pos.getFirst()][zero_pos.getLast()] = old_num;
                this.gamefield[zero_pos.getFirst()][zero_pos.getLast() + 1] = 0;
                break;
            case 4: // left 
                if (zero_pos.getLast() == 0) {
                    System.out.println("Zero is already at the left");
                    return;
                }
                old_num = this.gamefield[zero_pos.getFirst()][zero_pos.getLast() - 1];
                this.gamefield[zero_pos.getFirst()][zero_pos.getLast()] = old_num;
                this.gamefield[zero_pos.getFirst()][zero_pos.getLast() - 1] = 0;
                break;
            default:
                System.out.println("Unknown direction:" + direction);
        }
    }
}
