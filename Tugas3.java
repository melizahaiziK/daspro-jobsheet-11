import java.util.Scanner;
public class Tugas3 {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        int[][] hasil = new int[10][6];  
        System.out.println("=== Input Data Survei ===");
        for (int i = 0; i < hasil.length; i++) {
            System.out.println("Responden " + (i + 1));

            for (int j = 0; j < 6; j++) {
                while (true) {
                    System.out.print("Nilai pertanyaan " + (j + 1) + " (1-5): ");
                    int nilai = sc.nextInt();

                    if (nilai >= 1 && nilai <= 5) {
                        hasil [i][j] = nilai;
                        break;
                    } else {
                        System.out.println("Nilai harus bernilai 1 sampai 5! ");
                    }
                }
            }
        }
        System.out.println();
        System.out.println("=== Rata-Rata Setiap Pertanyaan ===");
        for (int j = 0; j < hasil[0].length; j++) {
            int total = 0;
            for (int i = 0; i < hasil.length; i++) {
                total += hasil [i][j];
            }
            double rata = total / 10.0;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata);
        }
   } 
}
