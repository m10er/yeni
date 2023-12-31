package entities;

import entities.TeknolojikUrun;

public class Telefon extends TeknolojikUrun {
    private  String kameraCozunurluk="Belirtilmemis";

    public Telefon() {
    }

    public Telefon(String kameraCozunurluk) {
        this.kameraCozunurluk = kameraCozunurluk;
    }

    public Telefon(String renk, String kameraCozunurluk) {
        super(renk);
        this.kameraCozunurluk = kameraCozunurluk;
    }

    public Telefon(String ad, String id, String aciklama, double fiyat, String renk, String kameraCozunurluk) {
        super(ad, id, aciklama, fiyat, renk);
        this.kameraCozunurluk = kameraCozunurluk;
    }

    public String getKameraCozunurluk() {
        return kameraCozunurluk;
    }

    public void setKameraCozunurluk(String kameraCozunurluk) {
        this.kameraCozunurluk = kameraCozunurluk;
    }

    @Override
    public String toString() {
        return   super.toString()+ " "+
                "kameraCozunurluk='" + kameraCozunurluk +"\n";
    }
}
