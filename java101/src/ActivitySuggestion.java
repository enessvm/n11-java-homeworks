import java.util.Scanner;

public class ActivitySuggestion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = input.nextInt();

        String activity =
                (temp < 5) ? "Skiing" :
                        (temp <= 15) ? "Cinema" :
                        (temp <= 25) ? "Picnic" :
                        "Swimming";

        System.out.println("Suggested activity: " + activity);

        input.close();
    }
}