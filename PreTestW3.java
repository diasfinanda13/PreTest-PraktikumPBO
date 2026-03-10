import java.util.Scanner;

public class PreTestW3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Usia (tahun)       : ");
        int usia = input.nextInt();

        System.out.print("Masukkan Berat Badan (kg)   : ");
        float beratBadan = input.nextFloat();

        System.out.print("Masukkan Kadar Hemoglobin   : ");
        float hemoglobin = input.nextFloat();

        System.out.println("\n=== Hasil Pemeriksaan ===");

        if (usia >= 17) {
            if (beratBadan >= 45) {
                if (hemoglobin >= 12.5) {
                    System.out.println("Anda memenuhi syarat untuk menjadi donor darah.");
                } else {
                    System.out.println("Tidak memenuhi syarat donor darah.");
                    System.out.println("Alasan: Kadar hemoglobin terlalu rendah.");
                }
            } else {
                System.out.println("Tidak memenuhi syarat donor darah.");
                System.out.println("Alasan: Berat badan kurang dari 45 kg.");
            }
        } else {
            System.out.println("Tidak memenuhi syarat donor darah.");
            System.out.println("Alasan: Usia harus minimal 17 tahun.");
        }

        input.close();
    }
}
