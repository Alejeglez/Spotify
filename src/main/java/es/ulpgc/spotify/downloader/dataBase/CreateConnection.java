package es.ulpgc.spotify.downloader.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateConnection {
    public CreateConnection(String name) {
        this.name = name;
    }

    private String name;

    public Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:" + name + ".db" ;
            conn = DriverManager.getConnection(url);


            return conn;


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }



    //Puedo usar sobrecarga es decir definir un metodo con mismo nombre paratodo con insertstatementOf


}
