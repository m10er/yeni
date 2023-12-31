package entities;

public class urun {
    private String ad;
    private String id;
    private String aciklama;
    private  double fiyat;

    public urun() {
    }

    public urun(String ad, String id, String aciklama, double fiyat) {
        this.fiyat=fiyat;
        this.ad = ad;
        this.id = id;
        this.aciklama = aciklama;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Override
    public String toString() {
        return "ad='" + ad + '\'' +
                ", id='" + id + '\'' +
                ", aciklama='" + aciklama + '\'' +
                "fiyat="+fiyat;
    }
}
