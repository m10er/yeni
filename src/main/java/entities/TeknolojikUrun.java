package entities;

public class TeknolojikUrun extends urun {
    private String renk;

    public TeknolojikUrun() {
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public TeknolojikUrun(String renk) {
        this.renk = renk;
    }

    public TeknolojikUrun(String ad, String id, String aciklama, double fiyat, String renk) {
        super(ad, id, aciklama, fiyat);
        this.renk = renk;
    }

    @Override
    public String toString() {
        return super.toString()+" "+
                "renk='" + renk ;
    }
}
