package user;

public class User {
    public String kullaniciAdi;
    public String email;
    public  long id;
    public String password;

    public User(String kullaniciAdi, String email, long id, String password) {
        this.kullaniciAdi = kullaniciAdi;
        this.email = email;
        this.id = id;
        this.password = password;
    }

    public User() {
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "kullaniciAdi='" + kullaniciAdi + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
