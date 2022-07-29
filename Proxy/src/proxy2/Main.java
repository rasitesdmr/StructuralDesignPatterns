package proxy2;

public class Main {
    public static void main(String[] args) {
        YoutubeDownloader safIndirici = new YoutubeDownloader(new UcuncuTarafYoutubeSinifi());
        YoutubeDownloader akilliIndirici = new YoutubeDownloader(new YoutubeProxy());

        long naive = test(safIndirici);
        long smart  =test(akilliIndirici);
        System.out.println("Proxy de önbelleğe alınarak kazanılan süre  " + (naive - smart) + " ms");

    }
    public static long test(YoutubeDownloader youtubeDownloader){
        long startTest = System.currentTimeMillis();
        youtubeDownloader.renderPopularVideos();
        youtubeDownloader.renderVideoPage("catzzzzzzzzz");
        youtubeDownloader.renderPopularVideos();
        youtubeDownloader.renderVideoPage("dancesvideoo");

        youtubeDownloader.renderVideoPage("catzzzzzzzzz");
        youtubeDownloader.renderVideoPage("someothervid");

        long tahminiSure = System.currentTimeMillis() -startTest;
        System.out.println("Geçen süre " + tahminiSure  +"ms\n");
        return tahminiSure;


    }
}
