package es.ulpgc.spotify.downloader.artist;


import java.util.List;


import static spark.Spark.get;
import static spark.Spark.halt;


public class GetArtistLocal {

    private List<Artist>artists;
    public GetArtistLocal(List<Artist> artists) {
        this.artists = artists;
    }


    public String getArtists() {
        get("/spotify-api/v1", (request, response) -> {
            response.header("content-type", "application/json");
            String popularityParam = request.queryParams("popularity");

            if(popularityParam == null) {
                ArtistToJson json = new ArtistToJson(artists);
                return json.getArtistJson();
            }

            try{
                int popularity = Integer.parseInt(popularityParam);
                FilterArtist artistsFiltered = new FilterArtist(artists, popularity);
                ArtistToJson json = new ArtistToJson(artistsFiltered.getFilteredArtist());
                return json.getArtistJson();


            } catch (Exception e) {
                halt(400, "Popularity param bad type. It should be a number");
                throw new RuntimeException(e);
            }

        });
        return  null;
    }
}

