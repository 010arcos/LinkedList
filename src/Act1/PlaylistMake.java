package Act1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlaylistMake {
    public static LinkedList<Cancion> LlamarPlaylist() { // // método para devolver la PLayList para llamarla en el MAIN

        ArrayList<Album> Albumes = new ArrayList<>();


        // Álbum de Romeo Santos
        Album albumRomeo = new Album("Fórmula, Vol. 2", "Romeo Santos");
        albumRomeo.addSong("Propuesta Indecente", 4.0);
        albumRomeo.addSong("Odio", 3.45);
        albumRomeo.addSong("Eres Mía", 4.12);
        albumRomeo.addSong("Hilito", 3.58);
        albumRomeo.addSong("Cancioncitas de Amor", 4.05);
        albumRomeo.addSong("Necio", 4.35);


        // Álbum de Fito y Fitipaldis
        Album albumFito = new Album("Por la Boca Vive el Pez", "Fito y Fitipaldis");
        albumFito.addSong("Por la Boca Vive el Pez", 4.35);
        albumFito.addSong("Me Equivocaría Otra Vez", 4.02);
        albumFito.addSong("Acabo de Llegar", 5.12);
        albumFito.addSong("Viene y Va", 4.47);
        albumFito.addSong("Donde Todo Empieza", 5.25);
        albumFito.addSong("Deltoya", 3.30);

        //Ahora añado los albums a Albumes
        Albumes.add(albumRomeo);
        Albumes.add(albumFito);

        //Creamos una lista de reproduccion
        LinkedList<Cancion> PlayList= new LinkedList<>();

        // Añadimos canciones A LA PLAYLIST del album de Romeo Santos
        albumRomeo.addToPlayList("Propuesta Indecente", PlayList);
        albumRomeo.addToPlayList(2, PlayList); // Añade "Odio"
        albumRomeo.addToPlayList(6, PlayList); // Añade "Necio"


        //Añadimos A LA PLAYLIST canciones del album de Fito
        albumFito.addToPlayList("Me Equivocaría Otra Vez", PlayList);
        albumFito.addToPlayList(3, PlayList); //acabo de llegar
        albumFito.addToPlayList(5, PlayList);//donde todo empieza

        return PlayList;






    }
    public static void printList(LinkedList<Cancion> lista){
        ListIterator<Cancion> iterator= lista.listIterator();
        System.out.println("Lista de reproduccion");
        int cont= 1;
        while (iterator.hasNext()){
            Cancion cancion= iterator.next();
            System.out.println(cont + ". " + cancion.toString());
            cont++;


        }
    }

    public static void printMenu() {
        System.out.println("Menú de opciones:");
        System.out.println("0 – Salir de la lista de reproducción");
        System.out.println("1 – Reproducir siguiente canción en la lista");
        System.out.println("2 – Reproducir la canción previa de la lista");
        System.out.println("3 – Repetir la canción actual");
        System.out.println("4 – Imprimir la lista de canciones en la playlist");
        System.out.println("5 – Volver a imprimir el menú");
        System.out.println("6 - ELiminar cancion");
    }















}
