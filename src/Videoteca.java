public class Videoteca {

    private String nombre;
    private String ubicacion;
    private Pelicula[] peliculas;
    private String fecha_ultima_act;

    public Videoteca(String nombre, String ubicacion, Pelicula[] peliculas, String fecha_ultima_act) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.peliculas = peliculas;
        this.fecha_ultima_act = fecha_ultima_act;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public String getFecha_ultima_act() {
        return fecha_ultima_act;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

    public void setFecha_ultima_act(String fecha_ultima_act) {
        this.fecha_ultima_act = fecha_ultima_act;
    }
}
