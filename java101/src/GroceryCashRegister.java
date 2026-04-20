import java.util.Scanner;

public class GroceryCashRegister {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;
        double totalPrice;

        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;

        System.out.print("How many kg Pear? : ");
        pearKg = input.nextDouble();

        System.out.print("How many kg Apple? : ");
        appleKg = input.nextDouble();

        System.out.print("How many kg Tomato? : ");
        tomatoKg = input.nextDouble();

        System.out.print("How many kg Banana? : ");
        bananaKg = input.nextDouble();

        System.out.print("How many kg Eggplant? : ");
        eggplantKg = input.nextDouble();

        totalPrice = (pearKg * pearPrice)
                + (appleKg * applePrice)
                + (tomatoKg * tomatoPrice)
                + (bananaKg * bananaPrice)
                + (eggplantKg * eggplantPrice);

        System.out.println("Total Price : " + totalPrice + " TL");
    }
}