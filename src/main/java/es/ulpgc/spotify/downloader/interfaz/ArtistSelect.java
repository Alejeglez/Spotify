package es.ulpgc.spotify.downloader.interfaz;

import es.ulpgc.spotify.downloader.artist.ArtistAccesor;
import es.ulpgc.spotify.downloader.artist.CreateArtist;
import es.ulpgc.spotify.downloader.artist.FilterArtist;

public class ArtistSelect {

    private String name;
    private CreateArtist creatorArtists;

    public ArtistSelect(String name, CreateArtist creatorArtists) {
        this.creatorArtists = creatorArtists;
        this.name = name;
    }


    public CreateArtist getArtistSelect() throws Exception {
        FilterArtist filteredArtist = new FilterArtist(creatorArtists.createArtist().getArtists(), name);
        ArtistAccesor accesorArtistFiltered = new ArtistAccesor(filteredArtist.getFilteredArtist());
        creatorArtists = new CreateArtist(accesorArtistFiltered.getJson());
        return creatorArtists;
    }
}
