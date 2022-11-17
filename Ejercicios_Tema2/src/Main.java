import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //El IGV en Perú es el 18%, lo asignaré a una variable para poder mostrar el resultado.
        System.out.println("INGRESE EL TOTAL DE SU COMPRA: ");

        Scanner sc = new Scanner(System.in);

        var compra = sc.nextDouble();

        var calculo = obtenerIGV(compra);

        System.out.println("El IGV ES: "+calculo);

    }

    static double obtenerIGV(double precio){
        return precio * 1.18;
    }
}