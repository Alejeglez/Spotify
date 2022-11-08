package es.ulpgc.spotify.downloader.artist;

import com.google.gson.Gson;

public class CreateArtist {

    private String json;

    public CreateArtist(String json) {
        this.json = json;
    }

    public ArtistList createArtist(){
        Gson gson = new Gson();

        ArtistList artists = gson.fromJson(json, ArtistList.class);

        return artists;
    }



}
