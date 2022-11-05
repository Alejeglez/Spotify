package es.ulpgc.spotify.downloader.artist;

public class Follower {

    private String href;
    private Double total;

    public String getHref() {
        return href;
    }

    public Double getTotal() {
        return total;
    }

    public Follower(String href, Double total) {
        this.href = href;
        this.total = total;
    }
}
