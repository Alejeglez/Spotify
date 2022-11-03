package es.ulpgc.spotify.downloader.artist;

import java.util.List;

public class FilterArtist {

    private int popularity;
    private List<Artist> artists;

    public FilterArtist(List<Artist> artists, int popularity) {
        this.artists = artists;
        this.popularity = popularity;
    }

    public List<Artist> getFilteredArtist(){
        int index = 0;
        for(Artist artist : artists){
            if(artist.getPopularity() < popularity){
                artists.remove(index);
            }
            index ++;
        }
        return artists;
    }
}
