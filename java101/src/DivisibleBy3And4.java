import java.util.Scanner;

public class DivisibleBy3And4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No numbers found divisible by 3 and 4.");
        }
        else {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
        }

        input.close();
    }
}