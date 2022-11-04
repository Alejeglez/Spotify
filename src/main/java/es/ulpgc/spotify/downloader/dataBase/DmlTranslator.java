package es.ulpgc.spotify.downloader.dataBase;

import es.ulpgc.spotify.downloader.artist.Artist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DmlTranslator {

    private Connection conn;




    public DmlTranslator(Connection conn) {
        this.conn = conn;
    }

    public void ArtistToDml(String name, String externalUrls, String followersHref, double followers, String genres, String href, String id, String imageUrl, String imageHeight, String imageWidth, int popularity, String type, String uri) throws SQLException {
        String DmlStatement = "INSERT INTO Artistas VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement pstmt = conn.prepareStatement(DmlStatement);
        pstmt.setString(1, name);
        pstmt.setString(2, externalUrls);
        pstmt.setString(3, followersHref);
        pstmt.setDouble(4, followers);
        pstmt.setString(5, genres);
        pstmt.setString(6, href);
        pstmt.setString(7, id);
        pstmt.setString(8, imageUrl);
        pstmt.setString(9, imageHeight);
        pstmt.setString(10, imageWidth);
        pstmt.setInt(11, popularity);
        pstmt.setString(12, type);
        pstmt.setString(13, uri);

        pstmt.executeUpdate();
    }
}
