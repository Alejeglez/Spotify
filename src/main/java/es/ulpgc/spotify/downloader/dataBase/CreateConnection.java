package es.ulpgc.spotify.downloader.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {
    public CreateConnection(String name) {
        this.name = name;
    }

    private String name;

    public void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:D:/Alejandro/Desktop/spotify/spotify/src/" + name + ".db" ;
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    //Puedo usar sobrecarga es decir definir un metodo con mismo nombre paratodo con insertstatementOf


}
