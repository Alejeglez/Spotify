package es.ulpgc.spotify.downloader.album;

import es.ulpgc.spotify.downloader.SpotifyAccessor;
import es.ulpgc.spotify.downloader.artistBase.ArtistBase;

import java.util.ArrayList;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.halt;

public class GetAlbums {

    private ArrayList<ArtistBase> artists;


    public GetAlbums(ArrayList<ArtistBase> artists) {
        this.artists = artists;
    }

    public String getAlbums(){
        get("/spotify-api/v1/albums/:artist", (request, response) -> {
            response.header("content-type", "application/json");
            String artistParam = request.params("artist");

            if(artistParam == null){halt(400, "Introduce an artist: example /spotify-api/v1/:EdSheeran.");}

            for(ArtistBase artist : artists){
                if(artistParam.equals(artist.getName())){
                    SpotifyAccessor accessor = new SpotifyAccessor();
                    String json = accessor.get("/artists/" + artist.getId() + "/albums", Map.of());
                    return json;
                }
            }

            halt(400, "Choose between EdSheeran, PharrellWilliams, MichaelJackson, ElvisPresley, TaylorSwift");
            return null;
        });
        return null;
    }
}
