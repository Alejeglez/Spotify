package es.ulpgc.spotify.downloader.album;

import es.ulpgc.spotify.downloader.artist.Artist;
import es.ulpgc.spotify.downloader.artist.Image;

import java.util.List;
import java.util.Map;

public class Album {

    private String album_type;

    private int total_tracks;

    private List<String> available_markets;

    private Map<String, String> external_urls;

    private String href;

    private String id;

    private List<Image> images;

    private String name;

    private String release_date;

    private String release_date_presicion;

    private Map<String, String> restrictions;

    private String type;

    private String uri;

    private List<Artist> artists;

    private int limit;

    private String next;

    private int offset;

    private String previous;

    private int total;

    public Album(String album_type, int total_tracks, List<String> available_markets, Map<String, String> external_urls, String href, String id, List<Image> images, String name, String release_date, String release_date_presicion, Map<String, String> restrictions, String type, String uri, List<Artist> artists, int limit, String next, int offset, String previous, int total) {
        this.album_type = album_type;
        this.total_tracks = total_tracks;
        this.available_markets = available_markets;
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.release_date = release_date;
        this.release_date_presicion = release_date_presicion;
        this.restrictions = restrictions;
        this.type = type;
        this.uri = uri;
        this.artists = artists;
        this.limit = limit;
        this.next = next;
        this.offset = offset;
        this.previous = previous;
        this.total = total;
    }
}
