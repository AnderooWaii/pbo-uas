
package com.perpustakan.jenisbuku;

import com.perpustakan.Interface.Buku;

public class BukuNonFiksi extends Buku {
    private String topic;

    public BukuNonFiksi(String nama, String kategori, String topic) {
        super(nama, kategori);
        this.topic = topic;
    }

    @Override
    public void menampilkanInformasi() {
        System.out.println("Non-Fiction Buku:");
        System.out.println("Name: " + nama);
        System.out.println("Category: " + kategori);
        System.out.println();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}