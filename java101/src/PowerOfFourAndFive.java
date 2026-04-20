import java.util.Scanner;

public class PowerOfFourAndFive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.println("Powers of 4 up to " + n + ":");

        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Powers of 5 up to " + n + ":");

        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }

        input.close();
    }
}