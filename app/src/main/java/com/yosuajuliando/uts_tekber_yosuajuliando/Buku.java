package com.yosuajuliando.uts_tekber_yosuajuliando;

public class Buku {

    private String Judul; //judul buku
    private String Kategori; //kategori
    private String Deskripsi; //deskripsi
    private int Thumbnail;

    public Buku() {
    }
//Alt ins
    public Buku(String judul, String kategori, String deskripsi, int thumbnail) {
        Judul = judul;
        Kategori = kategori;
        Deskripsi = deskripsi;
        Thumbnail = thumbnail;
    }

    public String getJudul() {
        return Judul;
    }

    public String getKategori() {
        return Kategori;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public void setKategori(String kategori) {
        Kategori = kategori;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
