package es.ulpgc.spotify.downloader.interfaz;

import es.ulpgc.spotify.downloader.album.AlbumAccessor;
import es.ulpgc.spotify.downloader.album.AlbumsList;
import es.ulpgc.spotify.downloader.album.CreateAlbums;
import es.ulpgc.spotify.downloader.artist.*;
import es.ulpgc.spotify.downloader.dataBase.CreateConnection;
import es.ulpgc.spotify.downloader.dataBase.DataBaseInsert;
import es.ulpgc.spotify.downloader.dataBase.DdlTranslator;
import es.ulpgc.spotify.downloader.tracks.CreateTracks;
import es.ulpgc.spotify.downloader.tracks.TrackAccessor;
import es.ulpgc.spotify.downloader.tracks.TracksList;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainScreen {
    public static ArrayList<String> urls;
    public static void Menu() throws Exception {
        System.out.println("Bienvenido a este programa, porfavor introduzca: ");
        System.out.println();
        System.out.println("1. Si desea introducir un artista en específico a descargar (Elija entre Michael Jackson, Elvis Presley, Ed Sheeran, Taylor Swift o Pharrell Williams). Se cargarán a continuación todas sus canciones y albumes.");
        System.out.println("2. Si desea descargar todos los artistas.");
        System.out.println();

        CreateConnection connection = new CreateConnection("SpotifyDB");
        DataBaseInsert insertElements = new DataBaseInsert(connection.connect());
        DdlTranslator creatorsTable = new DdlTranslator(connection.connect());
        Connection conn = connection.connect();
        System.out.println("Conectado a base de datos SpotifyDB.db");
        System.out.println();

        int i = 0;
        int select;
        Scanner leer = new Scanner(System.in);
        select = leer.nextInt();

        createArtist();
        ArtistAccessor accesor = new ArtistAccessor(urls);

        ArrayList<String> url2 = new ArrayList<>();

        CreateArtist creatorArtists = new CreateArtist(accesor.getJson());
        System.out.println("Artistas bases creados.");

        while(select == 1) {

            ArtistSelect artistSelect = null;
            System.out.print("Introduzca el nombre: ");
            Scanner leerName = new Scanner(System.in);
            String name = leerName.nextLine();
            artistSelect = new ArtistSelect(name, creatorArtists);

            System.out.println();

            ArtistList artistList = artistSelect.getArtistSelect().createArtist();
            List<Artist> artists = artistList.getArtists();
            Artist artist = artists.get(0);
            if(url2.contains(artist.getId()) == false) {
                url2.add(artist.getId());
            }
            else{
                break;
            }

            System.out.println("Artistas creados.");



            creatorsTable.createTableArtist();
            System.out.println("Tabla artistas creada.");


            insertElements.insertStatementOfArtist(artists);
            System.out.println("Artistas insertados en tabla correctamente.");
            System.out.println("Seleccione entre: ");
            System.out.println();
            System.out.println("1.Si desea cargar otro artista.(Introduzca un nombre de la lista, de lo contrario el programa se detendrá.)");
            System.out.println("2.Si desea descargar los albumes y canciones de los artistas actuales.");
            System.out.println();
            select = leer.nextInt();
            i = 1;

        }

        if(i == 0) {
            ArtistList artistList = creatorArtists.createArtist();
            List<Artist> artists = artistList.getArtists();
            creatorsTable.createTableArtist();
            System.out.println("Tabla artistas creada.");


            insertElements.insertStatementOfArtist(artists);
            System.out.println("Artistas insertados en tabla correctamente.");
            System.out.println();

        }


        if(url2.size() > 0){
            urls = url2;
        }

        AlbumAccessor accesorAlbum = new AlbumAccessor(urls);
        CreateAlbums creadorAlbums = new CreateAlbums(accesorAlbum.getJson());
        List<AlbumsList> albumsListOfList = creadorAlbums.createAlbums();

        System.out.println("Albums creados.");


        creatorsTable.createTableAlbums();

        System.out.println("Tabla albums creada.");

        for(AlbumsList albumsList : albumsListOfList){
            insertElements.insertStatementOfAlbum(albumsList.getItems());
        }

        System.out.println("Albums insertados.");
        System.out.println();

        TrackAccessor accesorTracks = new TrackAccessor(creadorAlbums.createAlbums());
        CreateTracks creadorTracks = new CreateTracks(accesorTracks.getJson());
        List<TracksList> tracksListOfList = creadorTracks.getTracks();

        System.out.println("Tracks creadas.");

        creatorsTable.createTableTracks();

        System.out.println("Tabla tracks creadas.");

        for(TracksList tracksList : tracksListOfList){
            insertElements.insertStatementOfTrack(tracksList.getItems());
        }

        System.out.println("Tracks insertadas en tabla.");
        System.out.println();

        conn.close();

        System.out.println("Conexión con base de datos cerrada. Ejecución finalizada.");

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
