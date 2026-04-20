import java.util.Scanner;

public class PrimeRecursive {

    static boolean isPrime(int number, int divisor) {

        if (number <= 2) {
            return (number == 2);
        }

        if (number % divisor == 0) {
            return false;
        }

        if (divisor * divisor > number) {
            return true;
        }

        return isPrime(number, divisor + 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " is PRIME!");
        } else {
            System.out.println(number + " is NOT PRIME!");
        }

        input.close();
    }
}