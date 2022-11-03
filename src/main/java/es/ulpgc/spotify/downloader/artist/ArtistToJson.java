package es.ulpgc.spotify.downloader.artist;

import com.google.gson.Gson;

import java.util.List;

public class ArtistToJson {

    private List<Artist> artists;

    public ArtistToJson(List<Artist> artists) {
        this.artists = artists;
    }

    public String getArtistJson(){

        Gson gson = new Gson();

        String json = gson.toJson(artists);
        return json;
    }
}
