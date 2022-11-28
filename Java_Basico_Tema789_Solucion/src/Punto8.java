import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Punto8 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("ORIGEN: ");
        String fileIn = sc.nextLine();
        System.out.println("DESTINO: ");
        String fileOut = sc.nextLine();
        sobreescribirFichero(fileIn,fileOut);

    }
     private static void sobreescribirFichero(String fileIn, String fileOut){
        try{InputStream in = new FileInputStream(fileIn);
        byte[] datos = in.readAllBytes();
        in.close();

        PrintStream out = new PrintStream(fileOut);
        out.write(datos);
        out.close();}
        catch (Exception e){
            System.out.println("La Excepcion es: "+e.getLocalizedMessage());
        }
    }

}
