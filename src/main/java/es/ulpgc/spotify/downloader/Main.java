package es.ulpgc.spotify.downloader;

import es.ulpgc.spotify.downloader.album.GetAlbums;
import es.ulpgc.spotify.downloader.artist.Artist;
import es.ulpgc.spotify.downloader.artist.CreateArtist;
import es.ulpgc.spotify.downloader.artist.GetArtist;
import es.ulpgc.spotify.downloader.artistBase.ArtistBase;
import es.ulpgc.spotify.downloader.interfaz.MainScreen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static ArrayList<ArtistBase> artists;

    public static void main(String[] args) throws Exception {
        createArtist();


        GetArtist artist1 = new GetArtist(artists);
        artist1.getArtists();
        //System.out.println(json);
        //GetAlbums albums = new GetAlbums(artists);
        //String albumsJson = albums.getAlbums();
        //CreateArtist creador = new CreateArtist(artistJson);
        //creador.createArtist();
        //System.out.println("Hola");
    }

    //TODO
    //List<Artist> getArtists(...) filtering by some criteria
    //List<Album> getAlbums(artist)
    //List<Track> getTracks(artist),

    private static void createArtist(){
        artists = new ArrayList<>();

        ArtistBase elvisPresley = new ArtistBase("ElvisPresley", "43ZHCT0cAZBISjO8DG9PnE", 79);
        artists.add(elvisPresley);
        ArtistBase michaelJackson = new ArtistBase("MichaelJackson", "3fMbdgg4jU18AjLCKBhRSm", 82);
        artists.add(michaelJackson);
        ArtistBase pharrellWilliams = new ArtistBase("PharrellWilliams", "2RdwBSPQiwcmiDo9kixcl8", 80);

        ArtistBase taylorSwift = new ArtistBase("TaylorSwift", "06HL4z0CvFAxyc27GXpf02", 100);
        artists.add(taylorSwift);
        ArtistBase edSheeran = new ArtistBase("EdSheeran", "6eUKZXaKkcviH0Ku9w2n3V", 90);
        artists.add(edSheeran);
        artists.add(pharrellWilliams);

    }
}
