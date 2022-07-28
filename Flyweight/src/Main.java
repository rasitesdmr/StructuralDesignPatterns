import java.awt.*;
import java.util.regex.Matcher;

public class Main {
    static int tuvalBoyutu = 1000;
    static int cizimYapilacakAgaclar = 1000000;
    static int agacTureleri = 4;


    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(cizimYapilacakAgaclar / agacTureleri); i++) {
            forest.plantTree(random(0, tuvalBoyutu), random(0, tuvalBoyutu), "Yaz meşesi",
                    Color.BLUE, "Meşe Doku saplaması ");
            forest.plantTree(random(0, tuvalBoyutu), random(0, tuvalBoyutu)
                    , "Sonbahar meşesi", Color.ORANGE, "Sonbahar Meşe Doku Taslak");
            forest.plantTree(random(0, tuvalBoyutu), random(0, tuvalBoyutu)
                    , "ilkbahar meşesi", Color.green, "ilkbahar Meşe Doku Taslak");
            forest.plantTree(random(0, tuvalBoyutu), random(0, tuvalBoyutu)
                    , "kış meşesi", Color.magenta, "ilkbahar Meşe Doku Taslak");

        }
        forest.setSize(tuvalBoyutu, tuvalBoyutu);
        forest.setVisible(true);

        System.out.println(cizimYapilacakAgaclar + " Ağaçlar çizilmiştir");
        System.out.println("------------");
        System.out.println("Memory kullanımı");
        System.out.println("Ağaç boyutu (8 byte ) * " + cizimYapilacakAgaclar);
        System.out.println("Ağaç türleri boyutu (~30 bytes) * " + agacTureleri + "");
        System.out.println("------------------");
        System.err.println("Toplam : " + ((cizimYapilacakAgaclar * 8 + agacTureleri * 30) /1024 /1024 )
                    + "Mb (normal de" + ((cizimYapilacakAgaclar * 38) / 1024 /1024 ) + " MB)");

        
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
