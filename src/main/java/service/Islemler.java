package service;

import dataBase.depo;
import entities.Bilgisayar;

public class Islemler {
    dataBase.depo depo= new depo();

    public void bilgisayarEkle(Bilgisayar bilgisayar){
        depo.bilgisayarList.add(bilgisayar);


    }

    public void bilgisayarSil(Bilgisayar bilgisayar){
        depo.bilgisayarList.remove(bilgisayar);
    }

    public void bilgisayarGuncelle(Bilgisayar silinecekBilgisayar, Bilgisayar eklenecekBilgisayar){
        depo.bilgisayarList.remove(silinecekBilgisayar);
        depo.bilgisayarList.add(eklenecekBilgisayar);
    }
    public void bilgisayarlariGoster(){
        System.out.println(depo.bilgisayarList);
    }
}
