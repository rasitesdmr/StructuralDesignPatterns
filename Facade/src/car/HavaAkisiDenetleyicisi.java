package car;

public class HavaAkisiDenetleyicisi {
    private HavaAkisOlcer havaAkisOlcer = new HavaAkisOlcer();

    public void havaAlmak(){
        havaAkisOlcer.olcumleriAl();
        System.out.println("Hava Sağlandı");
    }
    public void kapat(){
        System.out.println("Hava Kontrolü kapalı ");
    }

}
