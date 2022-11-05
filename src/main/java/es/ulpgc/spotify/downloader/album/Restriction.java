package es.ulpgc.spotify.downloader.album;

public class Restriction {

    private String reason;

    public String getReason() {
        return reason;
    }

    public Restriction(String reason) {
        this.reason = reason;
    }
}
