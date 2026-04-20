import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.print("Enter r: ");
        int r = input.nextInt();

        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid input!");
        }
        else {

            long nFact = 1;
            long rFact = 1;
            long diffFact = 1;

            // n!
            for (int i = 1; i <= n; i++) {
                nFact *= i;
            }

            // r!
            for (int i = 1; i <= r; i++) {
                rFact *= i;
            }

            // (n-r)!
            for (int i = 1; i <= (n - r); i++) {
                diffFact *= i;
            }

            long combination = nFact / (rFact * diffFact);

            System.out.println("C(" + n + "," + r + ") = " + combination);
        }

        input.close();
    }
}