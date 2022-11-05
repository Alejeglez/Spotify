package es.ulpgc.spotify.downloader.album;

import com.google.gson.Gson;
import es.ulpgc.spotify.downloader.artist.ArtistList;

import java.util.ArrayList;
import java.util.List;

public class CreateAlbums {
    private List<String> json;

    public CreateAlbums(List<String> json) {
        this.json = json;
    }

    public List<AlbumsList> createAlbums(){
        List<AlbumsList> albumsList = new ArrayList<>();

        for(String url : json) {
            Gson gson = new Gson();

            AlbumsList albums = gson.fromJson(url, AlbumsList.class);

            albumsList.add(albums);
        }
        return albumsList;
    }

}
