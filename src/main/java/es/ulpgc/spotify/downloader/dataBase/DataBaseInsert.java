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
            System.out.println(album.getRelease_date_precision());
            dmlTranslator.AlbumToDml(album.getName(), album.getAlbum_group(), album.getAlbum_type(), album.getArtists(), album.getAvailable_markets(), album.getExternal_urls(), album.getHref(), album.getId(), album.getImagesUrl(), album.getImagesWidth(), album.getImagesHeight(), album.getRelease_date(), album.getRelease_date_precision(), album.getTotal_tracks(), album.getType(), album.getUri());
        }
    }

    public void insertStatementOfTrack(List<Track> tracks) throws SQLException {
        DmlTranslator dmlTranslator = new DmlTranslator(conn);
        for (Track track : tracks){
            dmlTranslator.TrackToDML(track.getName(),  track.getArtists(), track.getAvailable_markets(), track.getDisc_number(), track.getDuration_ms(), track.isExplicit(), track.getExternal_urls(), track.getHref(), track.getId(), track.isIs_local(), track.getPreview_url(), track.getTrack_number(), track.getType(), track.getUri());
        }
    }

}
