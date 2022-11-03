package es.ulpgc.spotify.downloader.tracks;

import es.ulpgc.spotify.downloader.album.Album;
import es.ulpgc.spotify.downloader.artist.Artist;
import es.ulpgc.spotify.downloader.artist.External_urls;

import java.util.List;

public class Track {

    private Album album;
    private List<Artist> artists;
    private List<String> available_markets;
    private int disc_number;
    private int duration_ms;
    private boolean explicit;
    private External_urls external_urls;
    private String href;
    private String id;
    private boolean is_local;
    private String name;
    private String preview_url;
    private int track_number;
    private String type;
    private String uri;

    public Track(Album album, List<Artist> artists, List<String> available_markets, int disc_number, int duration_ms, boolean explicit, External_urls external_urls, String href, String id, boolean is_local, String name, String preview_url, int track_number, String type, String uri) {
        this.album = album;
        this.artists = artists;
        this.available_markets = available_markets;
        this.disc_number = disc_number;
        this.duration_ms = duration_ms;
        this.explicit = explicit;
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.is_local = is_local;
        this.name = name;
        this.preview_url = preview_url;
        this.track_number = track_number;
        this.type = type;
        this.uri = uri;
    }
}
