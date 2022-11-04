package es.ulpgc.spotify.downloader.dataBase;

import es.ulpgc.spotify.downloader.artist.Artist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DataBaseInsert {

    private Connection conn;




    public DataBaseInsert(Connection conn) {
        this.conn = conn;
    }

    public void insertStatementOf(List<Artist> artists) throws SQLException {
        DmlTranslator dmlTranslator = new DmlTranslator(conn);
        for(Artist artist : artists){
            dmlTranslator.ArtistToDml(artist.getName(), artist.getExternal_urls(), artist.getFollowersHref(), artist.getFollowers(), artist.getGenres(), artist.getHref(), artist.getId(), artist.getImagesUrl(), artist.getImagesHeight(), artist.getImagesWidth(), artist.getPopularity()
            , artist.getType(), artist.getUri());
        }

    }

}
