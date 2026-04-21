package MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int row, col;
    int mineCount;
    String[][] map;
    String[][] board;
    boolean[][] visited;

    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;

        this.map = new String[row][col];
        this.board = new String[row][col];
        this.visited = new boolean[row][col];

        this.mineCount = (row * col) / 4;

        initBoard();
        placeMines();
    }

    void initBoard() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                map[i][j] = "-";
                board[i][j] = "-";
                visited[i][j] = false;
            }
        }
    }

    void placeMines() {
        int placed = 0;

        while (placed < mineCount) {
            int r = rand.nextInt(row);
            int c = rand.nextInt(col);

            if (!map[r][c].equals("*")) {
                map[r][c] = "*";
                placed++;
            }
        }
    }

    void run() {

        System.out.println("Mine Sweeper Game Started!");
        print(board);

        int safeCells = (row * col) - mineCount;
        int opened = 0;

        while (true) {

            System.out.print("Row: ");
            int r = input.nextInt();

            System.out.print("Col: ");
            int c = input.nextInt();

            if (!isValid(r, c)) {
                System.out.println("Invalid coordinate!");
                continue;
            }

            if (visited[r][c]) {
                System.out.println("Already selected!");
                continue;
            }

            if (map[r][c].equals("*")) {
                System.out.println("Game Over!! You hit a mine!");
                print(map);
                break;
            }

            int count = countMines(r, c);
            board[r][c] = String.valueOf(count);
            visited[r][c] = true;
            opened++;

            print(board);

            if (opened == safeCells) {
                System.out.println("You Win!");
                print(board);
                break;
            }
        }
    }

    boolean isValid(int r, int c) {
        return r >= 0 && r < row && c >= 0 && c < col;
    }

    int countMines(int r, int c) {
        int count = 0;

        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {

                if (i == r && j == c) continue;

                if (i >= 0 && i < row && j >= 0 && j < col) {
                    if (map[i][j].equals("*")) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    void print(String[][] arr) {
        System.out.println("====================");

        for (String[] row : arr) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}