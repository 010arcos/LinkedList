package Act1;

import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedList<Cancion> PlayList= PlaylistMake.LlamarPlaylist();//Llamo a la Playlist
        ListIterator<Cancion>listIterator=PlayList.listIterator();

        boolean continuar= true;
        boolean haciaAdelante = true;
        PlaylistMake.printMenu();

        do {
            try {

                System.out.println("Introduce una opción");
                int opcion= sc.nextInt();
                sc.nextLine(); //Salto de linea

                switch (opcion){
                    case 0:
                        System.out.println("Hasta luego");
                        continuar=false;
                        break;
                    case 1:

                        if (!haciaAdelante) { //comprueba si el ultimo moviiento fue hacia atras
                            if (listIterator.hasNext()) listIterator.next();// comprueba que hay una cancion siguiente y actualiza el iterador para que se actualice y no se repita la cancion
                            haciaAdelante = true;
                        }

                        // Reproduce la siguiente canción, si es que hay
                        if (listIterator.hasNext()) {
                            System.out.println("Reproduciendo: " + listIterator.next().getTitulo());
                        } else {
                            System.out.println("Has llegado al final de la playlist.");
                        }
                        haciaAdelante=true; //cambiamos la direccion hacia adelante

                        break;
                    case 2: //ir hacia atras

                    if (haciaAdelante) { // comprueba si el ultimo movimiento fue hacia adelante
                        if (listIterator.hasPrevious()) listIterator.previous(); //comprueba si hay una cancion atras, y corrige la poscion del iterador para que no se repite la cancion
                        haciaAdelante = false; // actualizamos el flujo hacia atras
                    }

                        if (listIterator.hasPrevious()){
                            System.out.println("Reproduciendo: " + listIterator.previous().getTitulo());

                        }else {
                            System.out.println("Estas inicio de la Playlist");
                        }
                        haciaAdelante=false; //cambiamos la direccion hacia atras
                        break;
                    case 3:
                        /*Si estábamos yendo hacia adelante y hay una canción anterior, la reproduce*/
                        if (haciaAdelante && listIterator.hasPrevious()){ // si estamos reproduciendo hacia delante y hay una cancion anterior, esa es la actual
                            System.out.println("Reproduciendo: " + listIterator.previous().getTitulo());
                            haciaAdelante = false;//  cambiamos el flujo de la lista hacia atras, porque va a reproducir la cancion anterior, que es la actual
                        }else if(!haciaAdelante && listIterator.hasNext()){ // si estamos reproduciendo hacia atras y hay una siguiente cancion, esa es la actual.
                            System.out.println("Reproduciendo: " + listIterator.next().getTitulo());
                            haciaAdelante = true; //  cambiamos el flujo de la lista hacia adelante, porque va a reproducir la cancion siguiente, que es la actualte
                        }else {
                            System.out.println("No se puede repetir la cancion");
                        }
                        break;
                    case 4:
                        PlaylistMake.printList(PlayList);
                        break;
                    case 5:
                        PlaylistMake.printMenu();
                        break;
                    case 6://Eliminar la cancion
                        try {
                            if (haciaAdelante &&  listIterator.hasPrevious()){// si estoy yendo hacia adelante, y hay una cancion anterior esa es la cancion actual para eliminar

                                System.out.println("Se ha eliminado la cancion " + listIterator.previous().getTitulo());
                                listIterator.remove();
                                if (listIterator.hasNext()){
                                    listIterator.next();
                                System.out.println("Se esta reproduciendo: " + listIterator.previous().getTitulo());
                                haciaAdelante=false;}
                            } else if (!haciaAdelante && listIterator.hasNext()){ // si estoy yendo hacia atras, y hay una cancion siguiente esa es la cancion actual para eliminar

                                System.out.println("Se ha eliminado la cancion " + listIterator.next().getTitulo());
                                listIterator.remove();
                                if (listIterator.hasPrevious()) {
                                    listIterator.previous();
                                    System.out.println("Se esta reproduciendo: " + listIterator.next().getTitulo());

                                    haciaAdelante = true;
                                }

                            }else {
                                System.out.println("No hay canciones para eliminar");
                            }

                        }catch (NoSuchElementException ignored) {


                        }



                        break;
                    default:
                        System.out.println("Opcion no válida");
                        break;



                }

            }catch (InputMismatchException e){
                System.out.println("Carácter no válido");
                sc.nextLine();
                continuar= true;

            }


        }while (continuar); // // El bucle continúa mientras `continuar` sea verdadero



    }
}
