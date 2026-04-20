import java.util.Scanner;

public class PrintDiamond {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = input.nextInt();

        // Upper part (including middle line)
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part
        for (int i = n - 2; i >= 0; i--) {

            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        input.close();
    }
}