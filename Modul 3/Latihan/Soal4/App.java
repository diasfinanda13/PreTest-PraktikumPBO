import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian akhir: ");
        int nilai = input.nextInt();

        System.out.print("Masukkan persentase absensi: ");
        int absensi = input.nextInt();

        String status = (nilai >= 75 && absensi > 80) ? "Lulus" : "Tidak Lulus";

        System.out.println("Status Kelulusan: " + status);

        input.close();
    }
}