package com.perpustakan.Interface;

public interface Kegiatan {
    public void tambahBuku(Buku tBuku);
    public int getJumlahBuku();
    public void displayBuku();
    public void displayBuku(int jumlahBuku, String borrowerName);
    public void menampilkanOpsi(String borrowerName);

}
