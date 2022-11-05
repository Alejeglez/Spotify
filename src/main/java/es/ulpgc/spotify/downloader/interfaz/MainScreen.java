package es.ulpgc.spotify.downloader.interfaz;

import java.util.Scanner;

public class MainScreen {

    public void Menu() {
        System.out.println("Bienvenido a este programa, porfavor introduzca: ");
        System.out.println("1. Si desea introducir un artista en específico a descargar (Elija entre Michael Jackson, Elvis Presley, Ed Sheeran, Taylor Swift o Pharrell Williams)");
        System.out.println("2. Si desea descargar todos los artistas.");
        int select;
        Scanner leer = new Scanner(System.in);
        select = leer.nextInt();
        if (select == 1){
            System.out.println("Hola");
        }
    }
}
