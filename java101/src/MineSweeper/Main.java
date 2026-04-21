package MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int row, col;

        while (true) {
            System.out.print("Row: ");
            row = input.nextInt();

            System.out.print("Col: ");
            col = input.nextInt();

            if (row < 2 || col < 2) {
                System.out.println("Minimum size is 2x2!");
            } else {
                break;
            }
        }

        MineSweeper game = new MineSweeper(row, col);
        game.run();
    }
}
