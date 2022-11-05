package es.ulpgc.spotify.downloader.album;

import es.ulpgc.spotify.downloader.artist.Artist;
import es.ulpgc.spotify.downloader.artist.External_urls;
import es.ulpgc.spotify.downloader.artist.Image;

import java.util.List;
import java.util.Map;

public class Album {

    private String album_type;

    private int total_tracks;

    private List<String> available_markets;

    private External_urls external_urls;

    private String href;

    private String id;

    private List<Image> images;

    private String name;

    private String release_date;

    private String release_date_presicion;

    private Restriction restrictions;

    private String type;

    private String uri;

    private List<Artist> artists;

    private int limit;

    private String next;

    private int offset;

    private String previous;

    private int total;

    public Album(String album_type, int total_tracks, List<String> available_markets, External_urls external_urls, String href, String id, List<Image> images, String name, String release_date, String release_date_presicion, Restriction restrictions, String type, String uri, List<Artist> artists, int limit, String next, int offset, String previous, int total) {
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

    public String getAlbum_type() {
        return album_type;
    }

    public int getTotal_tracks() {
        return total_tracks;
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

    public String getImagesWidth(){
        String url = "";
        for(Image image : images){
            url += image.getWidth() + ",";
        }
        return  url.substring(0, url.length()-1);
    }
    public String getImagesHeight(){
        String url = "";
        for(Image image : images){
            url += image.getHeight() + ",";
        }
        return  url.substring(0, url.length()-1);
    }

    public String getName() {
        return name;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getRelease_date_presicion() {

        return release_date_presicion;
    }

    public String getRestrictions() {

        return restrictions.getReason();
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }

    public String getArtists() {

        String url = "";
        for(Artist artist : artists){
            url += artist.getName() + ",";
        }
        return url.substring(0, url.length()-1);
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


}
