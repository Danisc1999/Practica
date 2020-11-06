import java.io.File;

public class LeerXML {

    private static String dir_xml = new File("peliculas.xml").getAbsolutePath();

    public static void main(String[] args){
        System.out.println(dir_xml);
    }

}
