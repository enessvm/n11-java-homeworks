import java.util.Scanner;

public class RecursivePattern {

    static void pattern(int n, int original, boolean decreasing) {

        System.out.print(n + " ");

        // base condition is only controlled by direction change
        if (decreasing) {

            if (n <= 0) {
                pattern(n + 5, original, false);
            } else {
                pattern(n - 5, original, true);
            }

        } else {

            if (n == original) {
                return;
            } else {
                pattern(n + 5, original, false);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N value: ");
        int n = input.nextInt();

        pattern(n, n, true);

        input.close();
    }
}