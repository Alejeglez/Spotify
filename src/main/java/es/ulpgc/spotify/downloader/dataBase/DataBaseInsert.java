package es.ulpgc.spotify.downloader.dataBase;

import es.ulpgc.spotify.downloader.album.Album;
import es.ulpgc.spotify.downloader.artist.Artist;
import es.ulpgc.spotify.downloader.tracks.Track;

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

    public void insertStatementOfArtist(List<Artist> artists) throws SQLException {
        DmlTranslator dmlTranslator = new DmlTranslator(conn);
        for(Artist artist : artists){
            dmlTranslator.ArtistToDml(artist.getName(), artist.getExternal_urls(), artist.getFollowersHref(), artist.getFollowers(), artist.getGenres(), artist.getHref(), artist.getId(), artist.getImagesUrl(), artist.getImagesHeight(), artist.getImagesWidth(), artist.getPopularity()
            , artist.getType(), artist.getUri());
        }
    }

    public void  insertStatementOfAlbum(List<Album> albums) throws SQLException {
        DmlTranslator dmlTranslator = new DmlTranslator(conn);
        for(Album album : albums){
            dmlTranslator.AlbumToDml(album.getName(), album.getAlbum_type(), album.getTotal_tracks(), album.getAvailable_markets(), album.getExternal_urls(), album.getHref(), album.getId(), album.getImagesUrl(), album.getImagesHeight(), album.getImagesWidth(), album.getRelease_date(), album.getRelease_date_presicion(), album.getType(), album.getUri(), album.getArtists(), album.getLimit(), album.getNext(), album.getOffset(), album.getPrevious(), album.getTotal());
        }
    }

    public void insertStatementOfTrack(List<Track> tracks){
        DmlTranslator dmlTranslator = new DmlTranslator(conn);
        for (Track track : tracks){

        }
    }

}
