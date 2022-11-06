package es.ulpgc.spotify.downloader.interfaz;

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
import java.util.List;
import java.util.Scanner;

public class MainScreen {
    public static ArrayList<String> urls;
    public static void Menu() throws Exception {
        System.out.println("Bienvenido a este programa, porfavor introduzca: ");
        System.out.println("1. Si desea introducir un artista en específico a descargar (Elija entre Michael Jackson, Elvis Presley, Ed Sheeran, Taylor Swift o Pharrell Williams)");
        System.out.println("2. Si desea descargar todos los artistas.");

        int select;
        Scanner leer = new Scanner(System.in);
        select = leer.nextInt();

        createArtist();
        ArtistAccesor accesor = new ArtistAccesor(urls);
        CreateArtist creatorArtists = new CreateArtist(accesor.getJson());


        if (select == 1){
            System.out.print("Introduzca el nombre: ");
            String name = leer.next();
            FilterArtist filteredArtist = new FilterArtist(creatorArtists.createArtist().getArtists(), name);

        }


        ArtistList artistList = creatorArtists.createArtist();



        List<Artist> artists = artistList.getArtists();


        AlbumAccesor accesorAlbum = new AlbumAccesor(urls);
        CreateAlbums creadorAlbums = new CreateAlbums(accesorAlbum.getJson());
        TrackAccesor accesorTracks = new TrackAccesor(creadorAlbums.createAlbums());

        CreateTracks creadorTracks = new CreateTracks(accesorTracks.getJson());
        List<AlbumsList> albumsListOfList = creadorAlbums.createAlbums();
        List<TracksList> tracksListOfList = creadorTracks.getTracks();
        CreateConnection connection = new CreateConnection("SpotifyDB");
        DdlTranslator creatorsTable = new DdlTranslator(connection.connect());
        creatorsTable.createTableArtist();
        creatorsTable.createTableAlbums();
        creatorsTable.createTableTracks();
        DataBaseInsert insertArtist = new DataBaseInsert(connection.connect());
        insertArtist.insertStatementOfArtist(artists);
        for(AlbumsList albumsList : albumsListOfList){
            insertArtist.insertStatementOfAlbum(albumsList.getItems());
        }


        for(TracksList tracksList : tracksListOfList){
            insertArtist.insertStatementOfTrack(tracksList.getItems());
        }


    }

    private static void createArtist() {
        urls = new ArrayList<>();

        urls.add("43ZHCT0cAZBISjO8DG9PnE");
        urls.add("3fMbdgg4jU18AjLCKBhRSm");
        urls.add("2RdwBSPQiwcmiDo9kixcl8");
        urls.add("06HL4z0CvFAxyc27GXpf02");
        urls.add("6eUKZXaKkcviH0Ku9w2n3V");
    }
}
