package dataBase;

import entities.Bilgisayar;

import java.util.ArrayList;
import java.util.List;

public class depo {
    public List<Bilgisayar> bilgisayarList;
    public depo() {
        bilgisayarList= new ArrayList<>();
        sistemdekibilgisayalarimiz();
    }
    public void sistemdekibilgisayalarimiz(){
        Bilgisayar bilgisayar = new Bilgisayar();
        bilgisayar.setAciklama("2 yil garantili");
        bilgisayar.setAd("Macbook");
        bilgisayar.setId("1");
        bilgisayar.setRenk("mavi");
        bilgisayar.setRam("126");
        bilgisayar.setEkranKarti("126");
        bilgisayar.setFiyat(12000);
        bilgisayarList.add(bilgisayar);

        Bilgisayar bilgisayar1= new Bilgisayar();
        bilgisayar1.setEkranKarti("256");
        bilgisayar1.setRam("156");
        bilgisayar1.setRenk("beyaz");
        bilgisayar1.setId("2");
        bilgisayar1.setAciklama("1 yil garantili");
        bilgisayar1.setFiyat(10000);
        bilgisayarList.add(bilgisayar1);

        Bilgisayar bilgisayar2= new Bilgisayar();
        bilgisayar2.setEkranKarti("256");
        bilgisayar2.setRam("156");
        bilgisayar2.setRenk("beyaz");
        bilgisayar2.setId("3");
        bilgisayar2.setAciklama("1 yil garantili");
        bilgisayar2.setFiyat(8000);
        bilgisayarList.add(bilgisayar2);

    }
}
