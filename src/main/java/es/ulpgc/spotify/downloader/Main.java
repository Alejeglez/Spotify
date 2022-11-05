package es.ulpgc.spotify.downloader;

import es.ulpgc.spotify.downloader.album.AlbumAccesor;
import es.ulpgc.spotify.downloader.album.AlbumsList;
import es.ulpgc.spotify.downloader.album.CreateAlbums;
import es.ulpgc.spotify.downloader.artist.*;
import es.ulpgc.spotify.downloader.dataBase.CreateConnection;
import es.ulpgc.spotify.downloader.dataBase.DataBaseInsert;
import es.ulpgc.spotify.downloader.dataBase.DdlTranslator;
import es.ulpgc.spotify.downloader.tracks.CreateTracks;
import es.ulpgc.spotify.downloader.tracks.TrackAccesor;
import es.ulpgc.spotify.downloader.tracks.TracksList;

import java.util.ArrayList;

public class Main {

    public static ArrayList<String> urls;

    public static void main(String[] args) throws Exception {
        createArtist();


        ArtistAccesor accesor= new ArtistAccesor(urls);
        CreateArtist creadorArtistas = new CreateArtist(accesor.getJson());
        ArtistList artistList = creadorArtistas.createArtist();
        AlbumAccesor accesorAlbum = new AlbumAccesor(urls);
        CreateAlbums creadorAlbums = new CreateAlbums(accesorAlbum.getJson());
        TrackAccesor accesorTracks = new TrackAccesor(creadorAlbums.createAlbums());
        CreateTracks creadorTracks = new CreateTracks(accesorTracks.getJson());




        //CreateConnection connection = new CreateConnection("SpotifyDB");
        //DdlTranslator creatorsTable = new DdlTranslator(connection.connect());
        //creatorsTable.createTableArtist();
        //creatorsTable.createTableAlbums();
        //creatorsTable.createTableTracks();
        //DataBaseInsert insertArtist = new DataBaseInsert(connection.connect());
        //insertArtist.insertStatementOfArtist(artistList.getArtists());
        //for(AlbumsList albumsList : creadorAlbums.createAlbums()){
        //    insertArtist.insertStatementOfAlbum(albumsList.getItems());
        //}

        //for(TracksList tracksList : creadorTracks.getTracks()){
        //    insertArtist.insertStatementOfTrack(tracksList.getItems());
        //}


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
