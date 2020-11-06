public class Actor {

    private String nombre;
    private String enlace_wiki;

    public Actor(String nombre, String enlace_wiki) {
        this.nombre = nombre;
        this.enlace_wiki = enlace_wiki;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEnlace_wiki() {
        return enlace_wiki;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEnlace_wiki(String enlace_wiki) {
        this.enlace_wiki = enlace_wiki;
    }


}
