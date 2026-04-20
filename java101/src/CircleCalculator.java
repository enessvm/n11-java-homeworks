import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius, angle, area, perimeter, sliceArea;
        double pi = 3.14;

        System.out.print("Enter radius: ");
        radius = input.nextDouble();

        area = pi * radius * radius;
        perimeter = 2 * pi * radius;

        System.out.println("Circle area: " + area);
        System.out.println("Circle perimeter: " + perimeter);

        System.out.print("Enter center angle: ");
        angle = input.nextDouble();

        sliceArea = (pi * radius * radius * angle) / 360;

        System.out.println("Circle slice area: " + sliceArea);
    }
}