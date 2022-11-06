package es.ulpgc.spotify.downloader.album;

import es.ulpgc.spotify.downloader.SpotifyAccessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AlbumAccesor {

    public AlbumAccesor(List<String> urls) {
        this.urls = urls;
    }

    private List<String> urls;

    public ArrayList<String> getJson() throws Exception {

        ArrayList<String> jsonList = new ArrayList<>();
        for(String url : urls) {
            SpotifyAccessor accessor = new SpotifyAccessor();
            String json = accessor.get("/artists/" + url + "/albums", Map.of());
            jsonList.add(json);

        }


        return jsonList;
    }
}
