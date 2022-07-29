package proxy2;

import java.util.HashMap;

public class YoutubeDownloader {
    private UcuncuTarafYoutubeKitapligi ucuncuTarafYoutubeKitapligi;

    public YoutubeDownloader(UcuncuTarafYoutubeKitapligi ucuncuTarafYoutubeKitapligi) {
        this.ucuncuTarafYoutubeKitapligi = ucuncuTarafYoutubeKitapligi;
    }
    public void renderVideoPage(String videoId) {
        Video video = ucuncuTarafYoutubeKitapligi.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("proxy2.Video sayfası (süslü HTML'yi hayal edin)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.baslik);
        System.out.println("proxy2.Video: " + video.veri);
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = ucuncuTarafYoutubeKitapligi.populerVideolar();
        System.out.println("\n-------------------------------");
            System.out.println("YouTube'daki en popüler videolar (süslü HTML'yi hayal edin)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.baslik);
        }
        System.out.println("-------------------------------\n");
    }
}
