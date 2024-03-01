package Act1;

public class Cancion {
    //I
    private String titulo;
    private double duracion;

//II
    public Cancion(String titulo, double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }
    //Inicializando
    public Cancion() {
        this.titulo="";
        this.duracion=0;
    }

    //III
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }



    //IV
    @Override
    public String toString() {
        int minutos = (int) duracion;
        int segundos = (int) ((duracion - minutos) * 60);
        return titulo + ": " + minutos + " min " + segundos + " seg";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cancion cancion = (Cancion) o;

        if (Double.compare(cancion.duracion, duracion) != 0) return false;
        return titulo != null ? titulo.equals(cancion.titulo) : cancion.titulo == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = titulo != null ? titulo.hashCode() : 0;
        temp = Double.doubleToLongBits(duracion);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
