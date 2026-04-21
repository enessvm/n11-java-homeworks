import java.util.Scanner;

public class ClosestNumbers {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int closestSmaller = Integer.MIN_VALUE;
        int closestGreater = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < number && i > closestSmaller) {
                closestSmaller = i;
            }

            if (i > number && i < closestGreater) {
                closestGreater = i;
            }
        }

        System.out.println("Closest smaller number: " + closestSmaller);
        System.out.println("Closest greater number: " + closestGreater);

        input.close();
    }
}
