import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        int a = input.nextInt();

        System.out.print("Second number: ");
        int b = input.nextInt();

        System.out.print("Third number: ");
        int c = input.nextInt();

        int min, mid, max;

        // finding smallest
        if (a <= b && a <= c) {
            min = a;
            if (b <= c) {
                mid = b;
                max = c;
            } else {
                mid = c;
                max = b;
            }
        }
        else if (b <= a && b <= c) {
            min = b;
            if (a <= c) {
                mid = a;
                max = c;
            } else {
                mid = c;
                max = a;
            }
        }
        else {
            min = c;
            if (a <= b) {
                mid = a;
                max = b;
            } else {
                mid = b;
                max = a;
            }
        }

        System.out.println("Sorted: " + min + " " + mid + " " + max);

        input.close();
    }
}