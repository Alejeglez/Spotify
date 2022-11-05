package es.ulpgc.spotify.downloader.artist;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Artist {

    private External_urls external_urls;

    private Follower followers;

    private List<String> genres;

    private String href;

    private String id;

    private List<Image> images;

    private String name;

    private int popularity;

    private String type;

    private String uri;

    public Artist(External_urls external_urls, Follower followers, List<String> genres, String href, String id, List<Image> images, String name, int popularity, String type, String uri) {
        this.external_urls = external_urls;
        this.followers = followers;
        this.genres = genres;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.popularity = popularity;
        this.type = type;
        this.uri = uri;
    }

    public String getExternal_urls() {

        return external_urls.getSpotify();
    }

    public String getFollowersHref() {

        return (String) followers.getHref();
    }

    public Double getFollowers() {
        return followers.getTotal();
    }


    public String getGenres() {
        String url = "";
        for (String genre : genres) {
            url += genre + ",";
        }
        return url.substring(0, url.length() - 1);
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

    public int getPopularity() {
        return popularity;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }

}




