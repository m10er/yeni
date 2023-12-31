package user;

public class Satici extends User{
    public String hesapNumarasi;

    public Satici() {
    }

    public Satici(String kullaniciAdi, String email, long id, String password, String hesapNumarasi) {
        super(kullaniciAdi, email, id, password);
        this.hesapNumarasi = hesapNumarasi;
    }

    public Satici(String hesapNumarasi) {
        this.hesapNumarasi = hesapNumarasi;
    }

    public String getHesapNumarasi() {
        return hesapNumarasi;
    }

    public void setHesapNumarasi(String hesapNumarasi) {
        this.hesapNumarasi = hesapNumarasi;
    }

    @Override
    public String toString() {
        return "Satici{" +
                "hesapNumarasi='" + hesapNumarasi + '\'' +
                ", kullaniciAdi='" + kullaniciAdi + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
