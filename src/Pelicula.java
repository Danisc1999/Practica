public class Pelicula {

    private String titulo;
    private String sinopsis;
    private Actor[] reparto;
    private String genero;
    private String enlace_IMDB;

    public Pelicula(String titulo, String sinopsis, Actor[] reparto, String genero, String enlace_IMDB) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.reparto = reparto;
        this.genero = genero;
        this.enlace_IMDB = enlace_IMDB;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public Actor[] getReparto() {
        return reparto;
    }

    public String getGenero() {
        return genero;
    }

    public String getEnlace_IMDB() {
        return enlace_IMDB;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setReparto(Actor[] reparto) {
        this.reparto = reparto;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEnlace_IMDB(String enlace_IMDB) {
        this.enlace_IMDB = enlace_IMDB;
    }
}
