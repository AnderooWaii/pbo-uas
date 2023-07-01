package com.perpustakan.Interface;
public abstract class Buku {
    protected String nama;
    protected String kategori;

    public Buku(String nama, String kategori) {
        this.nama = nama;
        this.kategori = kategori;
    }

    public abstract void menampilkanInformasi();

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }
}