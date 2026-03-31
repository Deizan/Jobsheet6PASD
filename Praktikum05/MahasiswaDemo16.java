import java.util.Scanner;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16(jumlah);

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("\nData mahasiswa ke-" + i + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa16 m = new Mahasiswa16(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah selection sort (IPK ASC):");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah insertion sort (IPK ASC):");
        list.insertionSort();
        list.tampil();

        sc.close();
    }
}