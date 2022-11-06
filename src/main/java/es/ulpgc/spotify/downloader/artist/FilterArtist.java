package es.ulpgc.spotify.downloader.artist;

import java.util.ArrayList;
import java.util.List;

public class FilterArtist {

    private String name;
    private List<Artist> artists;

    public FilterArtist(List<Artist> artists, String name) {
        this.artists = artists;
        this.name = name;
    }

    public ArrayList<String> getFilteredArtist() {
        ArrayList<String> url = null;
        for (Artist artist : artists) {
            if (name.equals(artist.getName())) {
                url = new ArrayList<>();
                url.add(artist.getId());
            }
        }
        return url;
    }
}
