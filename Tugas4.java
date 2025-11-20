import java.util.Scanner;
public class Tugas4 {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
        int[][] hasil = new int[10][6];  
        System.out.println("=== Input Data Survei ===");
        for (int i = 0; i < hasil.length; i++) {
            System.out.println("\nResponden " + (i + 1));

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
        System.out.println("=== Rata-Rata Setiap Responden ===");
        for (int i = 0; i < hasil.length; i++) {
            int total = 0;
            for (int j = 0; j < hasil[0].length; j++) {
                total += hasil [i][j];
            }
            double rata = total / 6.0;
            System.out.println("Responden " + (i + 1) + ": " + rata);
        }
        System.out.println();
        System.out.println("=== Rata-Rata Setiap Pertanyaan ===");
        for (int j = 0; j < hasil[0].length; j++) {
            int total = 0;
            for (int i = 0; i < hasil.length; i++) {
                total += hasil [i][j];
            }
            double rata = total / hasil.length;
            System.out.println("Pertanyaan ke- " + (j + 1) + ": " + rata);
        }
        int totalkeseluruhan = 0;

        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[i].length; j++) {
                totalkeseluruhan += hasil[i][j];
            }
        }
        double rataTotal = totalkeseluruhan / (hasil.length * hasil[0].length);
        System.out.println("Rata-rata keseluruhan: " + rataTotal);
        
   } 
}
