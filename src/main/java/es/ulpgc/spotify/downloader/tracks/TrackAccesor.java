package es.ulpgc.spotify.downloader.tracks;

import es.ulpgc.spotify.downloader.SpotifyAccessor;
import es.ulpgc.spotify.downloader.album.Album;
import es.ulpgc.spotify.downloader.album.AlbumsList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TrackAccesor {

    private List<AlbumsList> listsAlbums;

    public TrackAccesor( List<AlbumsList> listsAlbums) {
        this.listsAlbums = listsAlbums;
    }

    public List<String> getJson() throws Exception {

        List<String> jsonList = new ArrayList<>();

        for(AlbumsList albumsList: listsAlbums){
            for(Album album : albumsList.getItems()){
                SpotifyAccessor accessor = new SpotifyAccessor();
                String json = accessor.get("/albums/" + album.getId() + "/tracks", Map.of());
                jsonList.add(json);
            }
        }

        return jsonList;
    }


}
