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

    public void AlbumToDml(String name, String albumGroup, String albumType, String artistName, String availableMarkets, String externalUrls, String href, String id, String imageUrl, String imageWidth, String imageHeight, String realeaseDate, String releaseDatePresicion, int totalTracks, String type, String uri) throws SQLException {

        String DmlStatement = "INSERT INTO Albumes VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement pstmt = conn.prepareStatement(DmlStatement);
        pstmt.setString(1, name);
        pstmt.setString(2, albumGroup);
        pstmt.setString(3, albumType);
        pstmt.setString(4, artistName);
        pstmt.setString(5, availableMarkets);
        pstmt.setString(6, externalUrls);
        pstmt.setString(7, href);
        pstmt.setString(8, id);
        pstmt.setString(9, imageUrl);
        pstmt.setString(10, imageHeight);
        pstmt.setString(11, imageWidth);
        pstmt.setString(12, realeaseDate);
        pstmt.setString(13, releaseDatePresicion);
        pstmt.setString(14, type);
        pstmt.setString(15, uri);
        pstmt.setInt(16, totalTracks);


        pstmt.executeUpdate();

    }

    public void TrackToDML(String name, String artists, String availableMarkets, int discNumber, int durationMs, Boolean explicit, String externalUrls,  String href, String id, boolean isLocal, String previewUrl, int trackNumber, String type, String uri) throws SQLException {

        String DmlStatement = "INSERT INTO Tracks VALUES (?,  ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement pstmt = conn.prepareStatement(DmlStatement);
        pstmt.setString(1, name);
        pstmt.setString(2, artists);
        pstmt.setString(3, availableMarkets);
        pstmt.setInt(4, discNumber);
        pstmt.setInt(5, durationMs);
        pstmt.setBoolean(6, explicit);
        pstmt.setString(7, externalUrls);
        pstmt.setString(8, href);
        pstmt.setString(9, id);
        pstmt.setBoolean(10, isLocal);
        pstmt.setString(11, previewUrl);
        pstmt.setInt(12, trackNumber);
        pstmt.setString(13, type);
        pstmt.setString(14, uri);

        pstmt.executeUpdate();

    }



}


