package es.ulpgc.spotify.downloader.artistBase;

public class ArtistBase {


    private String name;

    private String id;

    private int popularity;

    public ArtistBase(String name, String id, int popularity) {
        this.name = name;
        this.id = id;
        this.popularity = popularity;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getPopularity() {
        return popularity;
    }

}
