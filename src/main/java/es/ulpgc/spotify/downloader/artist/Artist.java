package es.ulpgc.spotify.downloader.artist;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Artist {

    private Map<String, String> external_urls;

    private Map<String, Object> followers;

    private List<String> genres;

    private String href;

    private String id;

    private List<Image> images;

    private String name;

    private int popularity;

    private String type;

    private String uri;

    public Map<String, String> getExternal_urls() {
        return external_urls;
    }

    public Map<String, Object> getFollowers() {
        return followers;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getHref() {
        return href;
    }

    public String getId() {
        return id;
    }

    public List<Image> getImages() {
        return images;
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

    public Artist(Map<String, String> external_urls, Map<String, Object> followers, List<String> genres, String href, String id, List<Image> images, String name, int popularity, String type, String uri) {
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
}
