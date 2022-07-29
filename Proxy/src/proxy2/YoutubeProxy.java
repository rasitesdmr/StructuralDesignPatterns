package proxy2;

import java.util.HashMap;

public class YoutubeProxy implements UcuncuTarafYoutubeKitapligi{

    private UcuncuTarafYoutubeKitapligi ucuncuTarafYoutubeKitapligi;
    private HashMap<String, Video> onbellektekiPopuler = new HashMap<String, Video>();
    private HashMap<String, Video> onbellektekiHepsi = new HashMap<String, Video>();

    public YoutubeProxy() {
        this.ucuncuTarafYoutubeKitapligi = new UcuncuTarafYoutubeSinifi();
    }


    @Override
    public HashMap<String, Video> populerVideolar() {
        if (onbellektekiPopuler.isEmpty()){
            onbellektekiPopuler = ucuncuTarafYoutubeKitapligi.populerVideolar();
        }else {
            System.out.println("Önbellekten alınan liste");
        }
        return onbellektekiPopuler;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = onbellektekiHepsi.get(videoId);
        if (video == null){
            video = ucuncuTarafYoutubeKitapligi.getVideo(videoId);
            onbellektekiHepsi.put(videoId, video);
        }else {
            System.out.println("Önbellekten " + videoId + " videosu alındı.");
        }
        return video;
    }
    public void reset(){
        onbellektekiPopuler.clear();
        onbellektekiHepsi.clear();
    }
}
