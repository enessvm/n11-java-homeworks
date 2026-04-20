import java.util.Scanner;

public class ATMScreen {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {

            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();

            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {

                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("\n1-Para yatırma\n" +
                            "2-Para çekme\n" +
                            "3-Bakiye sorgula\n" +
                            "4-Çıkış yap");

                    System.out.print("Lütfen işlem seçiniz : ");
                    select = input.nextInt();

                    switch (select) {

                        case 1:
                            System.out.print("Yatırılacak para miktarı: ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            System.out.println("Yeni bakiye: " + balance);
                            break;

                        case 2:
                            System.out.print("Çekilecek para miktarı: ");
                            int withdraw = input.nextInt();

                            if (withdraw > balance) {
                                System.out.println("Yetersiz bakiye!");
                            } else {
                                balance -= withdraw;
                                System.out.println("Yeni bakiye: " + balance);
                            }
                            break;

                        case 3:
                            System.out.println("Güncel bakiye: " + balance);
                            break;

                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            break;

                        default:
                            System.out.println("Geçersiz seçim!");
                    }

                } while (select != 4);

                System.out.println("Tekrar görüşmek üzere.");
                break;

            } else {

                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre!");

                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }

        input.close();
    }
}