Pertanyaan 5.2.5
1. Mengurutkan data secara ascending (kecil → besar) dengan cara:
nilai besar “naik” ke kanan seperti gelembung (bubble)
2. int min = i;
for (int j = i + 1; j < jumData; j++) {
    if (data[j] < data[min]) {
        min = j;
    }
}
3. Selama:
-masih di dalam array
-dan nilai lebih besar dari temp
maka elemen akan digeser ke kanan
4. Menggeser elemen ke kanan

Pertanyaan 5.3.4
1. 
a. Dalam Bubble Sort, jika kita memiliki n data, kita hanya butuh melakukan maksimal n - 1 langkah/iterasi luar untuk memastikan seluruh data terurut. Elemen terakhir secara otomatis akan berada di posisi yang benar setelah elemen-elemen lainnya terurut. Jadi, jika ada 5 data, setelah 4 kali putaran, data ke-5 pasti sudah pas posisinya.
b. Ini adalah bagian dari optimasi. Setiap kali satu siklus perulangan i selesai, satu elemen terbesar (pada sorting ascending) akan "mengapung" ke posisi paling belakang. Karena elemen di posisi belakang tersebut sudah pasti benar (sudah terurut), kita tidak perlu mengecek atau membandingkannya lagi di iterasi berikutnya. Pengurangan dengan - i membuat program berjalan lebih cepat karena jumlah perbandingan berkurang di setiap tahap.
c. Perulangan i berlangsung sebanyak: 49 kali (dari indeks 0 sampai 48).
​Tahap Bubble Sort yang ditempuh: 49 tahap.
2. sudah

Pertanyaan 5.3.7
1. Proses tersebut bertujuan untuk mencari indeks dengan nilai IPK terkecil dari sekumpulan data yang belum terurut. Setelah perulangan j selesai, kita akan mendapatkan posisi (indeks) dari data yang benar-benar paling kecil, yang nantinya akan ditukar (swap) ke posisi paling depan (indeks i).

Pertanyaan 5.4.3
1. sudah