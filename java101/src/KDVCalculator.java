import java.util.Scanner;

public class KDVCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price, kdvRate, kdvAmount, totalPrice;

        System.out.print("Enter the price: ");
        price = input.nextDouble();

        kdvRate = (price > 0 && price <= 1000) ? 0.18 : 0.08;

        kdvAmount = price * kdvRate;
        totalPrice = price + kdvAmount;

        System.out.println("Price without KDV: " + price);
        System.out.println("KDV rate: " + (kdvRate * 100) + "%");
        System.out.println("KDV amount: " + kdvAmount);
        System.out.println("Price with KDV: " + totalPrice);
    }
}