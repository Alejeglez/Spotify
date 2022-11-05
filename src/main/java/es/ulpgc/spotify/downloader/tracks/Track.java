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

    public Album getAlbum() {
        return album;
    }

    public String getArtists() {
        String url = "";
        for(Artist artist : artists){
            url += artist.getName();
        }
        return url.substring(0, url.length()-1);
    }

    public String getAvailable_markets() {
        String url = "";
        for(String market : available_markets){
            url += market;
        }
        return url.substring(0, url.length()-1);
    }

    public int getDisc_number() {
        return disc_number;
    }

    public int getDuration_ms() {
        return duration_ms;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public External_urls getExternal_urls() {
        return external_urls;
    }

    public String getHref() {
        return href;
    }

    public String getId() {
        return id;
    }

    public boolean isIs_local() {
        return is_local;
    }

    public String getName() {
        return name;
    }

    public String getPreview_url() {
        return preview_url;
    }

    public int getTrack_number() {
        return track_number;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }

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
