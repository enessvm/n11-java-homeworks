import java.util.Scanner;

public class TaximeterProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km, totalPrice;

        System.out.print("Enter distance in KM: ");
        km = input.nextDouble();

        totalPrice = 10 + (km * 2.20);

        totalPrice = (totalPrice < 20) ? 20 : totalPrice;

        System.out.println("Total taximeter price: " + totalPrice + " TL");
    }
}