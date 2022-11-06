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

    public Artist getFilteredArtist(){
        for(Artist artist : artists){
            if(name.equals(artist.getName())) {
                List<String> urls = new ArrayList<>();
                urls.add(artist.getId());
            }
        }
        return null;
    }
}
