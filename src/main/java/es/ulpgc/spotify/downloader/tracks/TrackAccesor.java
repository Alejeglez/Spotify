package es.ulpgc.spotify.downloader.tracks;

import es.ulpgc.spotify.downloader.SpotifyAccessor;
import es.ulpgc.spotify.downloader.album.Album;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TrackAccesor {

    private List<Album> albums;

    public TrackAccesor(List<Album> albums) {
        this.albums = albums;
    }

    public List<String> getJson() throws Exception {

        List<String> jsonList = new ArrayList<>();

        for(Album album : albums){
            SpotifyAccessor accessor = new SpotifyAccessor();
            String json = accessor.get("albums/" + album.getId() + "/tracks", Map.of());
            jsonList.add(json);
        }

        return jsonList;
    }


}
