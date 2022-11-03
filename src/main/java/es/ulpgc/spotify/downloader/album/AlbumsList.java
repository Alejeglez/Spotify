package es.ulpgc.spotify.downloader.album;

import java.util.List;

public class AlbumsList {

    private String href;
    private List<Album> items;
    private int limit;
    private String next;
    private int offset;
    private String previous;
    private int total;

    public AlbumsList(String href, List<Album> items, int limit, String next, int offset, String previous, int total) {
        this.href = href;
        this.items = items;
        this.limit = limit;
        this.next = next;
        this.offset = offset;
        this.previous = previous;
        this.total = total;
    }
}
