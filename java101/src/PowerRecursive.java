import java.util.Scanner;

public class PowerRecursive {

    static int power(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base value: ");
        int base = input.nextInt();

        System.out.print("Enter exponent value: ");
        int exponent = input.nextInt();

        int result = power(base, exponent);

        System.out.println("Result: " + result);

        input.close();
    }
}