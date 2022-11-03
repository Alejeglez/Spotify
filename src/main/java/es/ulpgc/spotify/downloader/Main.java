package es.ulpgc.spotify.downloader;

import es.ulpgc.spotify.downloader.artist.*;

import java.util.ArrayList;

public class Main {

    public static ArrayList<String> urls;

    public static void main(String[] args) throws Exception {
        createArtist();


        ArtistAccesor accesor= new ArtistAccesor(urls);
        CreateArtist creadorArtistas = new CreateArtist(accesor.getJson());
        ArtistList artistList = creadorArtistas.createArtist();
        GetArtistLocal artistLocal = new GetArtistLocal(artistList.getArtists());
        artistLocal.getArtists();
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
        urls = new ArrayList<>();

        urls.add("43ZHCT0cAZBISjO8DG9PnE");
        urls.add("3fMbdgg4jU18AjLCKBhRSm");
        urls.add("2RdwBSPQiwcmiDo9kixcl8");
        urls.add("06HL4z0CvFAxyc27GXpf02");
        urls.add("6eUKZXaKkcviH0Ku9w2n3V");


    }
}
