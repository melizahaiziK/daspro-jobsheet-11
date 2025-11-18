PERTANYAAN PERCOBAAN 1
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan! 
jawaban : Tidak, pengisian elemen array tidak harus dilakukan secara berurutan dari 0, kita bebas mengisi mulai dari angka berapa saja asalkan indeks yang dituju masih dalam rentang yang dituju.

2. Mengapa terdapat null pada daftar nama penonton?
jawaban : null muncul dalam output karena ada elemen array yang belum diisi nilai.

3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut!
    penonton[0][0] = "Amin";
    penonton[0][1] = "Bena";
    penonton[1][0] = "Candra";
    penonton[1][1] = "Dela";
    penonton[2][0] = "Eka";
    penonton[2][1] = "Farhan";
    penonton[3][0] = "Gisel";
    penonton[3][1] = "Hana";
jawaban : sudah diubah, output yang muncul bukan lagi null melainkan nama "hana" dikarenakan elemen array sudah diisi nilai.

4. Tambahkan kode program sebagai berikut:
   System.out.println(penonton.length);
   System.out.println(penonton[0].length);
   System.out.println(penonton[1].length);
   System.out.println(penonton[2].length);
   System.out.println(penonton[3].length);
Jelaskan fungsi dari penonton.length dan penonton[0].length!
Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa?
jawaban : fungsi dari penonton.length adalah memberikan jumlah baris dalam array 2 dimensi penonton. fungsi dari penonton[0].length adalah array pada baris pertama, yaitu baris dengan indeks 0, Karena tiap baris berisi array dengan 2 kolom maka hasil outputnya bernilai 2. penonton 1,2, dan 3 mempunyai nilai yang sama. Karena arraynya dituliskan  4 baris dan setiap baris memiliki array berukuran 2,maka nilai yang dihasilkan bernilai sama.

5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris pada array menggunakan for loop. Compile, run, lalu amati hasilnya.
for (int i = 0; i < penonton.length; i++) {
         System.out.println("Panjang baris ke- " + (i+1) + ": " + penonton[i].length);
      }
jawaban: output menghasilkan semua panjang baris ke- 0, 1,2 dan 3 bernilai 2

6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya.
for (String[] barisPenonton : penonton) {
         System.out.println("Panjang baris: " + barisPenonton.length);
      }
jawaban : program menghasilkan output yang sama seperti no 5

7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 menggunakan for loop. Compile, run, lalu amati hasilnya.
System.out.println("Penonton pada baris ke-3: ");
      for (int i = 0; i < penonton[2].length; i++) {
         System.out.println(penonton[2][i]);
      }
jawaban : output menghasilkan baris ke 3 eka farhan

8. Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach loop. Compile, run, lalu lakukan amati hasilnya. 
for (String i : penonton[2]) {
         System.out.println(i);
}
jawaban : program menghasilkan outout yang sama seperti no 7

9. Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.
for (int i = 0; i < penonton.length; i++) {
    System.out.println("Penonton pada baris ke- " + (i+1) + ": " + String.join(", ", penonton[i]));
} 
jawaban :program mengeluarkan output 
Penonton pada baris ke- 1: Amin, Bena  
Penonton pada baris ke- 2: Candra, Dela
Penonton pada baris ke- 3: Eka, Farhan 
Penonton pada baris ke- 4: Gisel, Hana    

10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?
jawaban : kelebihan foreach loop adalah lebih sederhana simple dan mudah dibaca, mengurangi risiko error indeks. Kekurangan foreach loop adalah tidak bisa mengakses indeks. Jika dibandingkan dengan for loop, kekurangan for loop adalah kebalikan dari foreach loop, yaitu lumayan panjang penulisannya dan kemungkinan errornya lebih besar ketimbang foreach loop, namun for loop jga mepunyai kelebihan yaitu bisa mengakses seluruh indeks.

11. Berapa indeks baris maksimal untuk array penonton?
jawaban : maksimalnya adalah 3

12. Berapa indeks kolom maksimal untuk array penonton?
jawaban : kolom maksimalnya adalah 1

13. Apa fungsi dari String.join()?
jawaban : metode yang digunakan untuk menggabungkan beberapa string menjadi satu.  