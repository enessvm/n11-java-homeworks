import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double height, weight, bmi;

        System.out.print("Please enter your height (in meters): ");
        height = input.nextDouble();

        System.out.print("Please enter your weight (kg): ");
        weight = input.nextDouble();

        bmi = weight / (height * height);

        System.out.println("Your Body Mass Index: " + bmi);
    }
}