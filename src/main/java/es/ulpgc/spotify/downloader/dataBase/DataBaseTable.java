package es.ulpgc.spotify.downloader.dataBase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseTable {

    private Connection conn;

    public DataBaseTable(Connection conn) {
        this.conn = conn;
    }

    public void createTableArtist() throws SQLException {
        Statement statement = conn.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS Artistas (" +
                "name TEXT NO NULL ," +
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

    public void removeTable(String table) throws SQLException {
        Statement statement = conn.createStatement();
        statement.execute("DROP TABLE " + table);
    }
}
