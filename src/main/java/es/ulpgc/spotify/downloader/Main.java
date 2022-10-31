package es.ulpgc.spotify.downloader;

import es.ulpgc.spotify.downloader.artist.Artist;
import es.ulpgc.spotify.downloader.artist.GetArtist;
import es.ulpgc.spotify.downloader.artistBase.ArtistBase;

import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static ArrayList<ArtistBase> artists;

    public static void main(String[] args) throws Exception {
        createArtist();
        GetArtist artist1 = new GetArtist(artists);
        artist1.getArtists();

    }

    //TODO
    //List<Artist> getArtists(...) filtering by some criteria
    //List<Album> getAlbums(artist)
    //List<Track> getTracks(artist),

    private static void createArtist(){
        artists = new ArrayList<>();

        ArtistBase elvisPresley = new ArtistBase("Elvis Presley", "43ZHCT0cAZBISjO8DG9PnE", 82);
        artists.add(elvisPresley);
        ArtistBase michaelJackson = new ArtistBase("Michael Jackson", "3fMbdgg4jU18AjLCKBhRSm", 85);
        artists.add(michaelJackson);
        ArtistBase pharrellWilliams = new ArtistBase("Pharrell Williams", "2RdwBSPQiwcmiDo9kixcl8", 85);

        ArtistBase taylorSwift = new ArtistBase("Taylor Swift", "06HL4z0CvFAxyc27GXpf02", 100);
        artists.add(taylorSwift);
        ArtistBase adele = new ArtistBase("Adele", "4dpBaseARuHxo51G3z768sgnrY", 88);
        artists.add(adele);
        artists.add(pharrellWilliams);

    }
}
