package es.ulpgc.spotify.downloader.artist;

import java.util.List;

public class ArtistList {

    public List<Artist> getArtists() {
        return artists;
    }

    public ArtistList(List<Artist> artists) {
        this.artists = artists;
    }

    private List<Artist> artists;

}
