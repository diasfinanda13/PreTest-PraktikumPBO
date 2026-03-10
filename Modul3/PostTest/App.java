import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int saldo = 500000;
        int pilih, jumlah;

        do {
            System.out.println("\nMenu ATM");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilih = in.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Saldo: Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Jumlah setor: ");
                    jumlah = in.nextInt();
                    saldo += jumlah;
                    break;

                case 3:
                    System.out.print("Jumlah tarik: ");
                    jumlah = in.nextInt();
                    if (saldo - jumlah >= 50000) {
                        saldo -= jumlah;
                    } else {
                        System.out.println("Saldo tidak mencukupi!");
                    }
                    break;

                case 4:
                    System.out.println("Keluar...");
                    break;
            }

        } while (pilih != 4);

        in.close();
    }
}