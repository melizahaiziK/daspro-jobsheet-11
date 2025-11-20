import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] hasil = new int[10][6];  
        System.out.println("=== Input Data Survei ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1));

            for (int j = 0; j < 6; j++) {
                while (true) {
                    System.out.print("Nilai pertanyaan " + (j + 1) + " (1-5): ");
                    int nilai = sc.nextInt();

                    if (nilai >= 1 && nilai <= 5) {
                        break;
                    } else {
                        System.out.println("Nilai harus bernilai 1 sampai 5! ");
                    }
                    hasil [i][j] = nilai;
                }
            }
        }
        System.out.println("\nData selesai disimpan.");
    }
}
