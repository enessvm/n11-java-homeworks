import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double side1, side2, hypotenuse;
        double a, b, c, u, area;

        System.out.print("Enter first perpendicular side: ");
        side1 = input.nextDouble();

        System.out.print("Enter second perpendicular side: ");
        side2 = input.nextDouble();

        hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));

        System.out.println("Hypotenuse: " + hypotenuse);

        System.out.print("Enter side a: ");
        a = input.nextDouble();

        System.out.print("Enter side b: ");
        b = input.nextDouble();

        System.out.print("Enter side c: ");
        c = input.nextDouble();

        u = (a + b + c) / 2;

        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Triangle area: " + area);
    }
}