package es.ulpgc.spotify.downloader;

import es.ulpgc.spotify.downloader.artist.Artist;
import es.ulpgc.spotify.downloader.artistBase.ArtistBase;

import java.util.ArrayList;
import java.util.Map;

public class Main {

    private static  ArrayList<ArtistBase> artists;

    public static void main(String[] args) throws Exception {

    }

    //TODO
    //List<Artist> getArtists(...) filtering by some criteria
    //List<Album> getAlbums(artist)
    //List<Track> getTracks(artist),

    private static void createArtist(){
        artists = new ArrayList<>();

        ArtistBase elvisPresley = new ArtistBase("Elvis Presley", "43ZHCT0cAZBISjO8DG9PnE", 82);
        ArtistBase michaelJackson = new ArtistBase("Michael Jackson", "3fMbdgg4jU18AjLCKBhRSm", 85);
        ArtistBase pharrellWilliams = new ArtistBase("Pharrell Williams", "2RdwBSPQiwcmiDo9kixcl8", 85);
        ArtistBase taylorSwift = new ArtistBase("Taylor Swift", "06HL4z0CvFAxyc27GXpf02", 100);
        ArtistBase adele = new ArtistBase("Adele", "4dpBaseARuHxo51G3z768sgnrY", 88);

    }
}
