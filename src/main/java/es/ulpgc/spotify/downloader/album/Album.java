package es.ulpgc.spotify.downloader.album;

import es.ulpgc.spotify.downloader.artist.Artist;
import es.ulpgc.spotify.downloader.artist.External_urls;
import es.ulpgc.spotify.downloader.artist.Image;

import java.util.List;

public class Album {

    private String album_group;
    private String album_type;
    private List<Artist> artists;



    private List<String> available_markets;
    private External_urls external_urls;
    private String href;
    private String id;
    private List<Image> images;
    private String name;
    private String release_date;
    private String release_date_precision;
    private int total_tracks;
    private String type;
    private String uri;

    public String getAlbum_group() {
        return album_group;
    }

    public String getAlbum_type() {
        return album_type;
    }

    public String getAvailable_markets() {
        String url = "";
        for(String market : available_markets){
            url += market + ",";
        }
        return url.substring(0, url.length()-1);
    }

    public String getExternal_urls() {
        return external_urls.getSpotify();
    }

    public String getArtists() {
        String url = "";
        for(Artist artist : artists){
            url += artist.getName();
        }
        return url.substring(0, url.length()-1);
    }

    public String getHref() {
        return href;
    }

    public String getId() {
        return id;
    }

    public String getImagesUrl() {
        String url = "";
        for (Image image : images) {
            url += image.getUrl() + ",";
        }
        return url.substring(0, url.length() - 1);
    }

    public String getImagesWidth() {
        String url = "";
        for (Image image : images) {
            url += image.getWidth() + ",";
        }
        return url.substring(0, url.length() - 1);
    }

    public String getImagesHeight() {
        String url = "";
        for (Image image : images) {
            url += image.getHeight() + ",";
        }
        return url.substring(0, url.length() - 1);
    }

    public String getName() {
        return name;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getRelease_date_precision() {
        return release_date_precision;
    }

    public int getTotal_tracks() {
        return total_tracks;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }

    public Album(String album_group, String album_type, List<Artist> artists, List<String> available_markets, External_urls external_urls, String href, String id, List<Image> images, String name, String release_date, String release_date_precision, int total_tracks, String type, String uri) {
        this.album_group = album_group;
        this.album_type = album_type;
        this.artists = artists;
        this.available_markets = available_markets;
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.release_date = release_date;
        this.release_date_precision = release_date_precision;
        this.total_tracks = total_tracks;
        this.type = type;
        this.uri = uri;
    }
}
