package com.perpustakan.jenisbuku;

import com.perpustakan.Interface.Buku;

public class BukuFiksi extends Buku {
    private String jenisCerita;

    public BukuFiksi(String nama, String kategori, String jenisCerita) {
        super(nama, kategori);
        this.jenisCerita = jenisCerita;
    }

    @Override
    public void menampilkanInformasi() {
        System.out.println("Fiction Buku:");
        System.out.println("Name: " + nama);
        System.out.println("Category: " + kategori);
        System.out.println("Jenis Cerita: " + jenisCerita);
        System.out.println();
    }
}