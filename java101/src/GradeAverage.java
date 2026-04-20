import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double math, physics, chemistry, turkish, history, music, average;

        System.out.print("Enter math grade: ");
        math = input.nextDouble();

        System.out.print("Enter physics grade: ");
        physics = input.nextDouble();

        System.out.print("Enter chemistry grade: ");
        chemistry = input.nextDouble();

        System.out.print("Enter turkish grade: ");
        turkish = input.nextDouble();

        System.out.print("Enter history grade: ");
        history = input.nextDouble();

        System.out.print("Enter music grade: ");
        music = input.nextDouble();

        average = (math + physics + chemistry + turkish + history + music) / 6;

        System.out.println("Average: " + average);

        String result = average > 60 ? "Passed" : "Failed";

        System.out.println(result);
    }
}