package com.perpustakan.proses;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.perpustakan.Interface.*;
import com.perpustakan.jenisbuku.BukuFiksi;
import com.perpustakan.jenisbuku.BukuNonFiksi;

public class Perpustakaan implements Kegiatan {
    private List<Buku> buku;
    private int jumlahBuku;

    public Perpustakaan() {
        buku = new ArrayList<>();
        jumlahBuku = 0;
    }

    public void tambahBuku(Buku tBuku) {
        buku.add(tBuku);
        jumlahBuku++;
    }


    public int getJumlahBuku() {
        return jumlahBuku;
    }

    public void displayBuku() {
        System.out.println("List Buku Yang Kamu Pinjam :");
        for (Buku Buku : buku) {
            System.out.println("- " + Buku.getNama() + " (" + Buku.getKategori() + ")");
        }
        System.out.println();
    }


    public void displayBuku(int jumlahBuku, String borrowerName){
        System.out.println("----------------------------");
        System.out.println("Nama : " + borrowerName + "\n");
        displayBuku();
        System.out.println("Total Meminjam Buku: " + jumlahBuku + "\n");
        System.out.println("------- Terima Kasih -------");

    }


    public void menampilkanOpsi(String borrowerName) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nPilihlah Option Berikut : :");
            System.out.println("1. Menambahkan Buku Fiksi");
            System.out.println("2. Menambahkan Buku Non Fiksi");
            System.out.println("3. Menampilkan Buku Yang Kamu Pinjam");
            System.out.println("4. Selesaikan Pinjaman");

            System.out.println("Masukan Angka Sesuai Dengan Pilihanmu : ");
            String opsi = scanner.next();
            scanner.nextLine(); // Consume the newline character

            if (opsi.equals("1")) {
                System.out.print("Tuliskan Nama buku: ");
                String namaBuku = scanner.nextLine();
                System.out.print("Tuliskan Category Buku: ");
                String kategoriBuku = scanner.nextLine();
                System.out.print("Tuliskan Jenis Cerita : ");
                String jenisCerita = scanner.nextLine();

                Buku Buku = new BukuFiksi(namaBuku, kategoriBuku, jenisCerita);
                tambahBuku(Buku);

                System.out.println(namaBuku + " Telah Di Tambahkan!\n");
            } else if (opsi.equals("2")) {
                System.out.print("Tuliskan Nama buku: ");
                String namaBuku = scanner.nextLine();
                System.out.print("Tuliskan Category Buku: ");
                String kategoriBuku = scanner.nextLine();
                System.out.print("Tuliskan Topik Buku: ");
                String topik = scanner.nextLine();

                Buku Buku = new BukuNonFiksi(namaBuku, kategoriBuku, topik);
                tambahBuku(Buku);

                System.out.println(namaBuku + " Telah Di Tambahkan!\n");
            } else if (opsi.equals("3")) {
                displayBuku();
            } else if (opsi.equals("4")) {
                break;
            } else {
                System.out.println("Opsi Salah, Silahkan Ulang Kembali\n");
            }
        }

       displayBuku(jumlahBuku, borrowerName);
    }
}

