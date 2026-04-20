import java.util.Scanner;

public class GradeHomework {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Math grade: ");
        int math = input.nextInt();

        System.out.print("Physics grade: ");
        int physics = input.nextInt();

        System.out.print("Turkish grade: ");
        int turkish = input.nextInt();

        System.out.print("Chemistry grade: ");
        int chemistry = input.nextInt();

        System.out.print("Music grade: ");
        int music = input.nextInt();

        int sum = 0;
        int count = 0;

        if (math >= 0 && math <= 100) {
            sum += math;
            count++;
        }

        if (physics >= 0 && physics <= 100) {
            sum += physics;
            count++;
        }

        if (turkish >= 0 && turkish <= 100) {
            sum += turkish;
            count++;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            sum += chemistry;
            count++;
        }

        if (music >= 0 && music <= 100) {
            sum += music;
            count++;
        }

        double average = (count > 0) ? (double) sum / count : 0;

        System.out.println("Average: " + average);

        if (average >= 55) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        input.close();
    }
}