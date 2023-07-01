package com.perpustakan.jenisbuku;

import com.perpustakan.Interface.Buku;

public class BukuFiksi extends Buku {
    private String author;

    public BukuFiksi(String nama, String kategori, String author) {
        super(nama, kategori);
        this.author = author;
    }

    @Override
    public void menampilkanInformasi() {
        System.out.println("Fiction Buku:");
        System.out.println("Name: " + nama);
        System.out.println("Category: " + kategori);
        System.out.println("Author: " + author);
        System.out.println();
    }
}