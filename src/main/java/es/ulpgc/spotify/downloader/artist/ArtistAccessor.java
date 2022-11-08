package es.ulpgc.spotify.downloader.artist;

import es.ulpgc.spotify.downloader.SpotifyAccessor;

import java.util.ArrayList;
import java.util.Map;

public class ArtistAccessor {

    public ArtistAccessor(ArrayList<String> urls) {
        this.urls = urls;
    }

    private ArrayList<String> urls;


    public String getJson() throws Exception {

        String param = "";

        for(String url : urls) {
            param += url + ",";
        }
        SpotifyAccessor accessor = new SpotifyAccessor();
        String json = accessor.get("/artists?ids=" + param.substring(0, param.length()-1), Map.of());
        return json;
    }

}
