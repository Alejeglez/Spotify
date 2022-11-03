package es.ulpgc.spotify.downloader.tracks;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class CreateTracks {

    private List<String> jsonList;

    public CreateTracks(List<String> jsonList) {
        this.jsonList = jsonList;
    }

    public List<TracksList> getTracks(){

        List<TracksList> tracksList = new ArrayList<>();

        for(String json : jsonList) {
            Gson gson = new Gson();

            TracksList tracks = gson.fromJson(json, TracksList.class);

            tracksList.add(tracks);
        }
        return tracksList;
    }
}
