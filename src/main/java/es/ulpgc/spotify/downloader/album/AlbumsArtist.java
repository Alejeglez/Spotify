package es.ulpgc.spotify.downloader.album;

import java.util.List;

public class AlbumsArtist {

    private String href;

    private List<Album> items;

    private int limit;

    private String next;

    private int offset;

    private String previous;

    public String getHref() {
        return href;
    }

    public List<Album> getItems() {
        return items;
    }

    public int getLimit() {
        return limit;
    }

    public String getNext() {
        return next;
    }

    public int getOffset() {
        return offset;
    }

    public String getPrevious() {
        return previous;
    }

    public int getTotal() {
        return total;
    }

    private int total;

    public AlbumsArtist(String href, List<Album> items, int limit, String next, int offset, String previous, int total) {
        this.href = href;
        this.items = items;
        this.limit = limit;
        this.next = next;
        this.offset = offset;
        this.previous = previous;
        this.total = total;
    }





}
