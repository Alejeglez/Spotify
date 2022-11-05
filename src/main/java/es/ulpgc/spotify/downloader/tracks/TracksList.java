package es.ulpgc.spotify.downloader.tracks;

import java.util.List;

public class TracksList {

    private String href;
    private List<Track> items;

    public List<Track> getItems() {
        return items;
    }

    private int limit;
    private String next;
    private int offset;
    private String previous;
    private int total;

    public TracksList(String href, List<Track> items, int limit, String next, int offset, String previous, int total) {
        this.href = href;
        this.items = items;
        this.limit = limit;
        this.next = next;
        this.offset = offset;
        this.previous = previous;
        this.total = total;
    }
}
