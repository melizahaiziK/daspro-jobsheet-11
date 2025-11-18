import java.util.Scanner;
public class BioskopWithScanner12 {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

    String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    int kolom = sc.nextInt();
                    sc.nextLine();
                    
                    if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi sudah terisi oleh " + penonton[baris-1][kolom-1]);
                        System.out.println("Silahkan isi data kembali dan pilih baris/kolom yang lain");
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                    }
                    break;
             
                case 2: 
                    System.out.println("\n=== DAFTAR PENONTON ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isi = (penonton[i][j] == null) ? "---" : penonton[i][j];
                            System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": " + isi);
                        }
                    }
                    break;

                case 3: 
                    System.out.println("Terima kasih!");
                    return;
            }      
        }
    }
}