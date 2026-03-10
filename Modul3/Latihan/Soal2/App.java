public class App {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int pinBenar = 123456;
        int percobaan = 0;

        while (percobaan < 3) {
            System.out.print("Masukkan PIN: ");
            int pin = input.nextInt();

            if (pin == pinBenar) {
                System.out.println("Login berhasil!");
                break;
            } else {
                percobaan++;
                System.out.println("PIN salah!");

                if (percobaan == 3) {
                    System.out.println("Akun diblokir");
                } else {
                    System.out.println("Sisa percobaan: " + (3 - percobaan));
                }
            }
        }

        input.close();
    }
}
