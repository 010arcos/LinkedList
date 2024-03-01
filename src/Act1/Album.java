package Act1;

import java.util.ArrayList;
import java.util.LinkedList;

//V
public class Album {
    private String nombre;
    private String artista;
    private final ArrayList<Cancion> canciones = new ArrayList<>();

    public Album() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    //VI
    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
        // lo inicializo dentro del constructor, asi me lo reconoce
    }

    //VII
    private Cancion findSong(String tituloCancion) {
        for (Cancion cancion : canciones) {
            if (cancion.getTitulo().equalsIgnoreCase(tituloCancion)) {
                return cancion; // la cancion existe
            }

        }
        return null; // sino existe

    }

    //VIII
    public boolean addSong(String tituloCancion, double duracion){
        Cancion cancion = findSong(tituloCancion);
        if (findSong(tituloCancion)==null){ // si la cancion no existe
            canciones.add(new Cancion(tituloCancion, duracion)) ;//añadimos a una nueva instancia
            return true; // devuelvo verdadero se añade con exito
        }
        else {
            System.out.println("La canción '" + tituloCancion + "' ya existe en el álbum.");
            return false; // devuelve false que no se ha añadido
        }
    }



    //IX
    public boolean addToPlayList(int numeroPistaAlbum, LinkedList<Cancion> List){
        int index= numeroPistaAlbum-1; // hacemos esto porque la lista no empieza en 1 sino en 0, por lo que restamos 1
        if (index>=0 && index < canciones.size()){//verificamos que el indice este dentro del rango
            if (findSong(canciones.get(index).getTitulo())!=null){ // // comprobamos que existe sacando el index, luego el titulo comparando con que no sea null (es decir, que exista la cancion)
                List.add(canciones.get(index));
                return true; // se añadio correctamente
            }else{
                System.out.println("La cancion no existe en el album");
                return false; // no se añadio
            }


        }else {
            System.out.println("Número fuera de rango");
            return false; // no se añadio
        }
    }








    //IXpercibe
    public boolean addToPlayList(String tituloCancion, LinkedList<Cancion> List){

        Cancion titulo= findSong(tituloCancion);
        if (titulo!=null){ //si existe
            List.add(titulo);/// añado a la lista
            return true; // se añadio correctamente

        }
        else {
            System.out.println("La canción '" + tituloCancion + "' no se encuentra en el álbum.");
            return false; // no se añadio
        }
    }











    }

