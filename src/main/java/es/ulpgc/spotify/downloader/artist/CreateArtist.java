package es.ulpgc.spotify.downloader.artist;

import com.google.gson.Gson;
import java.util.Arrays;
import java.util.List;

public class CreateArtist {

    private String json;

    public CreateArtist(String json) {
        this.json = json;
    }

    public void createArtist(){
        Gson gson = new Gson();

        ArtistList artists = gson.fromJson(json, ArtistList.class);

        for(Artist artist : artists.getArtists()){
            System.out.println(artist.getName());
        }
    }


}
