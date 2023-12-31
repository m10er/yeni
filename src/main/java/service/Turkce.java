package service;

import dataBase.depo;
import entities.Bilgisayar;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Turkce implements Service {
    Scanner scanner = new Scanner(System.in);
    dataBase.depo depo = new depo();

    @Override
    public void bilgisayarEkle() {
        System.out.println("Lutfen eklemek istediginiz bilgisayarin adini giriniz");
        String bilgisayarAd= scanner.next();
        System.out.println("Lutfen eklemek istedginiz bilgisayarin rengini giriniz");
        String bilgisayarRenk= scanner.next();
        System.out.println("Lutfen eklemek istediginiz bilgisayarin aciklamasini giriniz");
        String bilgisayarAciklama= scanner.next();
        System.out.println("Lutfen eklemek istedginiz bilgisayarin ekran kartini giriniz");
        String bilgisayarEkranKarti= scanner.next();
        System.out.println("Lutfen eklemek istediginiz bilgisayarin ramini giriniz");
        String bilgisayarRam= scanner.next();
        System.out.println("Lutfen eklemek istediginiz bilgisayarin fiyatini giriniz");
        double bilgisayarFiyat= scanner.nextDouble();
        Bilgisayar bilgisayar = new Bilgisayar();
        bilgisayar.setAd(bilgisayarAd);
        bilgisayar.setRenk(bilgisayarRenk);
        bilgisayar.setAciklama(bilgisayarAciklama);
        bilgisayar.setEkranKarti(bilgisayarEkranKarti);
        bilgisayar.setRam(bilgisayarRam);
        bilgisayar.setFiyat(bilgisayarFiyat);
        bilgisayar.setId(bilgisayar.getId());

        depo.bilgisayarList.add(bilgisayar);

    }

    @Override
    public void bilgisayarGuncelle() {
        System.out.println("Lutfen degistirmek istediginiz bilgisayarin id sini giriniz");
        String id = scanner.next();
        Bilgisayar bilgisayar = new Bilgisayar();
        for (Bilgisayar each :
                depo.bilgisayarList) {
            if (each.getId().equals(id)) {
                bilgisayar = each;
            }
            System.out.println("Lutfen bilgisayarin yeni adini giriniz");
            String bilgisayarAd = scanner.next();
            System.out.println("Lutfen bilgisayarin yeni rengini giriniz");
            String bilgisayarRenk = scanner.next();
            System.out.println("Lutfen bilgisayarin yeni aciklamasini giriniz");
            String bilgisayarAciklama = scanner.next();
            System.out.println("Lutfen bilgisayarin yeni ekran kartini giriniz");
            String bilgisayarEkranKarti = scanner.next();
            System.out.println("Lutfen bilgisayarin ramini giriniz");
            String bilgisayarRam = scanner.next();
            System.out.println("Lutfen bilgisayarin fiyatini giriniz");
            double bilgisayarFiyat = scanner.nextDouble();

            bilgisayar.setAd(bilgisayarAd);
            bilgisayar.setRenk(bilgisayarRenk);
            bilgisayar.setAciklama(bilgisayarAciklama);
            bilgisayar.setEkranKarti(bilgisayarEkranKarti);
            bilgisayar.setRam(bilgisayarRam);
            bilgisayar.setFiyat(bilgisayarFiyat);

        }
    }
    @Override
    public void bilgisayarSil() {
        System.out.println("Silmek istediginiz bilgisayarin idsini giriniz.");
        String id= scanner.next();
        Bilgisayar bilgisayar = new Bilgisayar();

        for (Bilgisayar each:
                depo.bilgisayarList) {
            if (each.getId().equals(id)){
                bilgisayar=each;
            }
        }
        depo.bilgisayarList.remove(bilgisayar);


    }

    @Override
    public void bilgisayarListele() {
        System.out.println("Tum biligisayarlari gormek icin 1'e");
        System.out.println("Fiyata gore bilgisayalari siralamak icin 2 ye");
        System.out.println("Indirim oranina gore bilgisayarlari siralamak icin 3'e");
        String  deger= scanner.next();

        switch (deger){
            case "1":
                System.out.println(depo.bilgisayarList);
                break;
            case "2":

                List<Bilgisayar> bilgisayar = depo.bilgisayarList.stream().sorted(Comparator.comparingDouble(Bilgisayar::getFiyat)).collect(Collectors.toList());
                for (Bilgisayar each:
                        bilgisayar) {
                    System.out.println(each);
                }
                break;
            case "3":
                System.out.println("bu hizmeti sunamiyoruz suan");
                break;


                }

        }

}
