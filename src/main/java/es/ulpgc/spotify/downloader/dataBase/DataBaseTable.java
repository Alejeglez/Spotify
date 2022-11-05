package es.ulpgc.spotify.downloader.dataBase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseTable {

    private Connection conn;

    public DataBaseTable(Connection conn) throws SQLException {
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
                "albumType TEXT NO NULL ," +
                "totalTracks REAL ," +
                "availableMarkets TEXT ,"+
                "external_urls TEXT ," +
                "href TEXT ," +
                "id TEXT ," +
                "imageUrl TEXT NO NULL," +
                "imageHeight TEXT NO NULL," +
                "imageWidth TEXT NO NULL," +
                "realeaseDate TEXT NO NULL," +
                "realeaseDatePresicion TEXT NO NULL," +
                "type TEXT NO NULL," +
                "uri TEXT NO NULL," +
                "artistName TEXT NO NULL," +
                "limitAlbum REAL NO NULL," +
                "next TEXT NO NULL," +
                "offset REAL NO NULL," +
                "previous TEXT NO NULL," +
                "total REAL NO NULL" +
                ")");

    }


}
