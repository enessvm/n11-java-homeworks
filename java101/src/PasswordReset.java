import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctPassword = "java123";
        String enteredPassword, newPassword;
        int choice;

        System.out.print("Enter your password: ");
        enteredPassword = input.nextLine();

        if (enteredPassword.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Wrong password!");
            System.out.print("Do you want to reset your password? (1-Yes / 2-No): ");
            choice = input.nextInt();
            input.nextLine(); // clear buffer

            if (choice == 1) {

                System.out.print("Enter new password: ");
                newPassword = input.nextLine();

                if (newPassword.equals(correctPassword)) {
                    System.out.println("Password could not be created, please choose another password.");
                } else {
                    System.out.println("Password created successfully.");
                }

            } else {
                System.out.println("Password reset cancelled.");
            }
        }
    }
}