package entities;

public class Bilgisayar extends TeknolojikUrun {
    private String ram="Belirtilmemis";
    private String ekranKarti="Belirtilmemis";

    public Bilgisayar() {
    }

    public Bilgisayar(String ram, String ekranKarti) {
        this.ram = ram;
        this.ekranKarti = ekranKarti;
    }

    public Bilgisayar(String renk, String ram, String ekranKarti) {
        super(renk);
        this.ram = ram;
        this.ekranKarti = ekranKarti;
    }

    public Bilgisayar(String ad, String id, String aciklama, double fiyat, String renk, String ram, String ekranKarti) {
        super(ad, id, aciklama, fiyat, renk);
        this.ram = ram;
        this.ekranKarti = ekranKarti;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getEkranKarti() {
        return ekranKarti;
    }

    public void setEkranKarti(String ekranKarti) {
        this.ekranKarti = ekranKarti;
    }

    @Override
    public String toString() {
        return super.toString()+" "+
                "ram='" + ram + '\'' +
                ", ekranKarti='" + ekranKarti +"\n";
    }
}
