package es.ulpgc.spotify.downloader.artist;

import es.ulpgc.spotify.downloader.SpotifyAccessor;
import es.ulpgc.spotify.downloader.artistBase.ArtistBase;

import java.util.List;
import java.util.Map;


import static spark.Spark.get;
import static spark.Spark.halt;


public class GetArtist {

    public GetArtist(List<ArtistBase> artists) {
        this.artists = artists;
    }

    private List<ArtistBase> artists;

    public String getArtists() {
        get("/spotify-api/v1", (request, response) -> {
            response.header("content-type", "application/json");
            String popularity = request.queryParams("popularity");
            String query = "";



            if (popularity == null) {
                for(ArtistBase artista: artists) {
                    query += artista.getId() + ",";
                }

                SpotifyAccessor accessor = new SpotifyAccessor();
                String json = accessor.get("/artists?ids=" + query.substring(0, query.length()-1), Map.of());
                return json;
            }

            try{
                int popularityParams = Integer.parseInt(popularity);
                for(ArtistBase artista: artists){
                    if(artista.getPopularity() >= popularityParams){
                        query += artista.getId() + ",";
                    }
                }
                SpotifyAccessor accessor = new SpotifyAccessor();
                String json = accessor.get("/artists?ids=" + query.substring(0, query.length()-1), Map.of());
                return json;
            }
            catch (NumberFormatException e){
                halt(400, "Bad type for popularity param");
            }


            return null;
        });
        return null;
    }
}

