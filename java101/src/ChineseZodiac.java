import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int year = input.nextInt();

        String zodiac = "";

        int result = year % 12;

        if (result == 0) {
            zodiac = "Monkey";
        }
        else if (result == 1) {
            zodiac = "Rooster";
        }
        else if (result == 2) {
            zodiac = "Dog";
        }
        else if (result == 3) {
            zodiac = "Pig";
        }
        else if (result == 4) {
            zodiac = "Rat";
        }
        else if (result == 5) {
            zodiac = "Ox";
        }
        else if (result == 6) {
            zodiac = "Tiger";
        }
        else if (result == 7) {
            zodiac = "Rabbit";
        }
        else if (result == 8) {
            zodiac = "Dragon";
        }
        else if (result == 9) {
            zodiac = "Snake";
        }
        else if (result == 10) {
            zodiac = "Horse";
        }
        else if (result == 11) {
            zodiac = "Goat";
        }

        System.out.println("Your Chinese Zodiac sign: " + zodiac);

        input.close();
    }
}