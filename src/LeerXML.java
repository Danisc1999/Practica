import java.io.File;
import java.util.ArrayList;

public class LeerXML { //Sergio Luna

    private static String dir_xml = new File("peliculas.xml").getAbsolutePath();
    private ArrayList<Videoteca> videotecas;

    public static void main(String[] args){
        System.out.println(dir_xml);
    }

    public ArrayList<Videoteca> getVideotecas() {
        return videotecas;
    }

    public ArrayList<Videoteca> leeXML(){


        return this.videotecas;
    }

}
