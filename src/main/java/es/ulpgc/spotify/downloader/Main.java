package es.ulpgc.spotify.downloader;


import es.ulpgc.spotify.downloader.interfaz.MainScreen;



public class Main {


    public static void main(String[] args) throws Exception {

        MainScreen screen = new MainScreen();
        screen.Menu();



    }

    //TODO
    //List<Artist> getArtists(...) filtering by some criteria
    //List<Album> getAlbums(artist)
    //List<Track> getTracks(artist),


}
