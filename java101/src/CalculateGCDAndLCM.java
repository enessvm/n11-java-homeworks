import java.util.Scanner;

public class CalculateGCDAndLCM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        int n1 = input.nextInt();

        System.out.print("Second number: ");
        int n2 = input.nextInt();

        int a = n1;
        int b = n2;

        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }

        int gcd = n1;


        int lcm = (a * b) / gcd;

        System.out.println("EBOB: " + gcd);
        System.out.println("EKOK: " + lcm);

        input.close();
    }
}