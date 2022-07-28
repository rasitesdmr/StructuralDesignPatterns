public class AdapterPatternDriver {
    public static void main(String[] args) {

        Movable bugattiVerona = new BugattiVeyron();
        MovableAdapter bugattiVeronaAdapter = new MovableAdapterImpl(bugattiVerona);
        System.out.println("Bugatti Veyronun KMPH cinsinden en yüksek hızı :" + bugattiVeronaAdapter.getSpeed() + " KMPH");

        Movable mphBugattiVerone = new BugattiVeyron();
        mphBugattiVerone.getSpeed();
        System.out.println("Bugatti veyron MPH cinsinden en yüksek hızı : " + mphBugattiVerone.getSpeed() + " MPH");

        System.out.println("--------------------------");

        Movable astonMartin =new AstonMartin();
        MovableAdapter astonMartinAdapter = new MovableAdapterImpl(astonMartin);
        System.out.println("AstonMartin'in KMPH cinsinden hızı en yüksek hızı : " + astonMartinAdapter.getSpeed() + " KMPH") ;

        Movable mphAstonMartin = new AstonMartin();
        mphAstonMartin.getSpeed();
        System.out.println("AstonMartin'in MPH cinsinden hızı en yüksek hızı  : " + mphAstonMartin.getSpeed() + " MPH");

        System.out.println("--------------------------");


        Movable mcLaren = new McLaren();
        MovableAdapter mcLarenAdapter = new MovableAdapterImpl(mcLaren);
        System.out.println("Mc Laren'ın KMPH cinsinden en yüksek hızı :" + mcLarenAdapter.getSpeed() + " KMPH");

        Movable mphMcLaren = new McLaren();
        mphMcLaren.getSpeed();
        System.out.println("Mc Laren'ın MPh cinsinden en yüksek hızı :" + mphMcLaren.getSpeed() + " MPH");
    }
}
