package vut.th.third;

public class Numbers implements Comparable<Numbers> {
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

    @Override
    public int compareTo(Numbers o) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.gamefield[i][j] != o.gamefield[i][j]) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public void print() {
        for (int i = 0; i < 3; i++) {
            System.out.println(gamefield[i][0] + " " + gamefield[i][1] + " " + gamefield[i][2]);
        }
    }

    public void move(int direction) {
        int x_pos = 0;
        int y_pos = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.gamefield[i][j] == 0) {
                    x_pos = i;
                    y_pos = j;
                }
            }
        }
        int old_num;
        switch (direction) {
            case 1: // up
                if (x_pos == 0) {
                    System.out.println("Zero is already at the top");
                    return;
                }
                old_num = this.gamefield[x_pos - 1][y_pos];
                this.gamefield[x_pos][y_pos] = old_num;
                this.gamefield[x_pos - 1][y_pos] = 0;
                break;
            case 2: // down
                if (x_pos == 2) {
                    System.out.println("Zero is already at the bottom");
                    return;
                }
                old_num = this.gamefield[x_pos + 1][y_pos];
                this.gamefield[x_pos][y_pos] = old_num;
                this.gamefield[x_pos + 1][y_pos] = 0;
                break;
            case 3: // right
                if (y_pos == 2) {
                    System.out.println("Zero is already at the right");
                    return;
                }
                old_num = this.gamefield[x_pos][y_pos + 1];
                this.gamefield[x_pos][y_pos] = old_num;
                this.gamefield[x_pos][y_pos + 1] = 0;
                break;
            case 4: // left
                if (y_pos == 0) {
                    System.out.println("Zero is already at the left");
                    return;
                }
                old_num = this.gamefield[x_pos][y_pos - 1];
                this.gamefield[x_pos][y_pos] = old_num;
                this.gamefield[x_pos][y_pos - 1] = 0;
                break;
            default:
                System.out.println("Unknown direction:" + direction);
        }
    }

}
