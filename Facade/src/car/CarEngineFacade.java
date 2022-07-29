package car;

public class CarEngineFacade {
    private static final int varsayilanSogutmaSicakligi = 80;
    private static final int izinVerilenMaxSicakligi = 50;
    private HavaAkisiDenetleyicisi havaAkisiDenetleyicisi = new HavaAkisiDenetleyicisi();
    private Mars mars = new Mars();
    private SogutmaKontrolu sogutmaKontrolu = new SogutmaKontrolu();
    private KatalitikDonusturucu katalitikDonusturucu = new KatalitikDonusturucu();

    public void startEngine(){
        havaAkisiDenetleyicisi.havaAlmak();
        mars.calistir();
        sogutmaKontrolu.sicaklikUstLimitAyarla(varsayilanSogutmaSicakligi);
        sogutmaKontrolu.calistir();
        katalitikDonusturucu.acik();
    }
    public void stopEngine(){
        katalitikDonusturucu.kapali();
        sogutmaKontrolu.serin(izinVerilenMaxSicakligi);
        sogutmaKontrolu.kapat();
        havaAkisiDenetleyicisi.kapat();
    }
}
