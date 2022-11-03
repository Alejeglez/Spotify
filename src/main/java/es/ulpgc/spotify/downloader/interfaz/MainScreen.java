package es.ulpgc.spotify.downloader.interfaz;

import java.util.Scanner;

public class MainScreen {

    public void Menu() {
        System.out.println("Bienvenido a este programa, porfavor introduzca si lo desea un índice de popularidad, para obtener los artistas: ");
        int popularity;
        Scanner leer = new Scanner(System.in);
        popularity = leer.nextInt();
        System.out.println();
    }
}
