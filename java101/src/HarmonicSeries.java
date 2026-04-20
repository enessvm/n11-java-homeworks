import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        double result = 0.0;

        for (int i = 1; i <= n; i++) {
            result += (1.0 / i);
        }

        System.out.println("Harmonic Series Result: " + result);

        input.close();
    }
}