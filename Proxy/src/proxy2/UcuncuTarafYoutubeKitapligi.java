package proxy2;

import java.util.HashMap;

public interface UcuncuTarafYoutubeKitapligi {
    HashMap<String,Video> populerVideolar();

    Video getVideo(String videoId);
}
