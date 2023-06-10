package com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nama Anda : ");
        String nama = scanner.nextLine();

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.menampilkanMenu(nama);
    }
}
