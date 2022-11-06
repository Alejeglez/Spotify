package es.ulpgc.spotify.downloader.dataBase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DdlTranslator {

    private Connection conn;

    public DdlTranslator(Connection conn) throws SQLException {
        this.conn = conn;
    }


    public void createTableArtist() throws SQLException {

        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS Artistas (" +
                "name TEXT NO NULL PRIMARY KEY ," +
                "externalUrls TEXT ," +
                "followersHref TEXT ,"+
                "followers REAL ," +
                "genres TEXT ," +
                "href TEXT ," +
                "id TEXT ," +
                "imageUrl TEXT," +
                "imageHeight TEXT ," +
                "imageWidth TEXT ," +
                "popularity REAL ," +
                "type TEXT ," +
                "uri TEXT" +
                ")");
    }

    public void createTableAlbums() throws SQLException {

        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS Albumes (" +
                "name TEXT NO NULL ," +
                "albumGroup TEXT NO NULL , "+
                "albumType TEXT NO NULL ," +
                "artistName TEXT NO NULL," +
                "availableMarkets TEXT ,"+
                "externalUrls TEXT ," +
                "href TEXT ," +
                "id TEXT ," +
                "imageUrl TEXT NO NULL," +
                "imageHeight TEXT NO NULL," +
                "imageWidth TEXT NO NULL," +
                "realeaseDate TEXT NO NULL," +
                "realeaseDatePresicion TEXT NO NULL," +
                "type TEXT NO NULL," +
                "uri TEXT NO NULL," +
                "totalTracks REAL" +
                ")");

    }

    public void createTableTracks() throws SQLException {
        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS Tracks (" +
                "name TEXT NO NULL," +
                "artists TEXT NO NULL ," +
                "availableMarkets TEXT ," +
                "discNumber REAL ,"+
                "durationMs REAL ," +
                "explicit BOOLEAN NO NULL ," +
                "externalUrls TEXT ,"+
                "href TEXT ," +
                "id TEXT ," +
                "isLocal BOOLEAN NO NULL," +
                "previewUrl TEXT NO NULL," +
                "trackNumber REAL NO NULL," +
                "type TEXT NO NULL," +
                "uri TEXT NO NULL" +
                ")");
    }

}
