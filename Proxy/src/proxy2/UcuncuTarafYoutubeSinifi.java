package proxy2;

import java.util.HashMap;

public class UcuncuTarafYoutubeSinifi implements UcuncuTarafYoutubeKitapligi {

    @Override
    public HashMap<String, Video> populerVideolar() {
        sunucuyaBaglan("https://www.youtube.com");
        return rasgeleVideoAl();
    }

    @Override
    public Video getVideo(String videoId) {
        sunucuyaBaglan("https://www.youtube.com/" + videoId);
        return birazVideoAl(videoId);
    }

    private HashMap<String, Video> rasgeleVideoAl() {
        System.out.println("Popülerler iniyor");

        agGecikmesiniDenetleyin();
        HashMap<String, Video> map = new HashMap<String, Video>();
        map.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        map.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        map.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        map.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        map.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));
        System.out.println("Tamamlandı " + "\n");
        return map;
    }

    private Video birazVideoAl(String videoId) {
        System.out.println("proxy2.Video indiriliyor");
        agGecikmesiniDenetleyin();
        Video video = new Video(videoId, "Bazı video başlığı");
        System.out.println("Tamamlandı " + "\n");
        return video;
    }

    private int rasgele(int min, int max) {
        return (int) (min + (Math.random()) * ((max - min) + 1));
    }

    public void agGecikmesiniDenetleyin() {
        int rasgeleGecikme = rasgele(5, 10);
        for (int i = 0; i < rasgeleGecikme; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }

    public void sunucuyaBaglan(String sunucu) {
        System.out.println("Bağlanıyor" + sunucu + "...");
        agGecikmesiniDenetleyin();
        System.out.println("Bağlandı " + "\n");
    }
}
