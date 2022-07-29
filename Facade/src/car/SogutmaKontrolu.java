package car;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SogutmaKontrolu {
    private static final int varsayilanRadyotorHizi = 5;

    public int ustLimitSicaklik;
    private Radyator radyator = new Radyator();
    private SicaklikSensoru sicaklikSensoru = new SicaklikSensoru();

    public void sicaklikUstLimitAyarla(int ustLimitSicaklik){
        System.out.println("Sıcakık üst sınırı ayarlanıyor : " + ustLimitSicaklik);
        this.ustLimitSicaklik = ustLimitSicaklik;
    }

    public void calistir(){
        System.out.println("Soğutam kontrolü hazır");
        radyator.hizAyarla(varsayilanRadyotorHizi);
    }
    public void serin(int izinVerilenMaxSicaklik){
        System.out.println("İzin verilen maksimum sıcaklıkta programlı soğutma" + izinVerilenMaxSicaklik);
        sicaklikSensoru.sicakligiAl();
        radyator.acik();
    }
    public void kapat(){
        System.out.println("Soğutma kontrolü kapalı");
        radyator.kapali();
    }

}
