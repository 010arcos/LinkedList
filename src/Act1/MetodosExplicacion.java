package Act1;

public class MetodosExplicacion {
    /*
    Método eliminar
                        /*
                        // Asumimos que haciaAdelante indica la dirección de la iteración.
if (haciaAdelante && listIterator.hasPrevious()) {
    // Si estamos yendo hacia adelante, nos movemos hacia atrás primero para apuntar al elemento actual correctamente.
    String tituloCancion = listIterator.previous().getTitulo(); // Obtenemos el título antes de eliminar.
    listIterator.remove(); // Eliminamos el elemento actual.
    // Solo intentamos avanzar si hay un elemento siguiente después de eliminar.
    if (listIterator.hasNext()) {
        listIterator.next();
    }
    System.out.println("Se ha eliminado la cancion " + tituloCancion);
    haciaAdelante = false; // Cambiamos la dirección ya que hemos manipulado la lista.
} else if (!haciaAdelante && listIterator.hasNext()) {
    // Si estamos yendo hacia atrás, nos movemos hacia adelante primero para apuntar al elemento actual correctamente.
    String tituloCancion = listIterator.next().getTitulo(); // Obtenemos el título antes de eliminar.
    listIterator.remove(); // Eliminamos el elemento actual.
    // Solo intentamos retroceder si hay un elemento anterior después de eliminar.
    if (listIterator.hasPrevious()) {
        listIterator.previous();
    }
    System.out.println("Se ha eliminado la cancion " + tituloCancion);
    haciaAdelante = true; // Cambiamos la dirección ya que hemos manipulado la lista.
}

                         */





    /*
    case 6: //Eliminar la cancion
    if (haciaAdelante && listIterator.hasPrevious()) { // si estoy yendo hacia adelante, y hay una canion anterior esa es la cancion actual para eliminar
        System.out.println("Se ha eliminado la cancion " + listIterator.previous().getTitulo());
        listIterator.remove();
        haciaAdelante = false;
    } else if (!haciaAdelante && listIterator.hasNext()) { // si estoy yendo hacia atras, y hay una cancion siguiente esa es la cancion actual para eliminar
        System.out.println("Se ha eliminado la cancion " + listIterator.next().getTitulo());
        listIterator.remove();
        haciaAdelante = true;
    } else {
        System.out.println("No hay canción para eliminar en esta dirección");
    }
    break;



     */
}
