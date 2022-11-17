import java.util.Scanner;

public class Solucion_Tema3 {
    public static void main(String[] args) {
    //SOLUCION AL EJERCICIO 03

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de nombres que desea ingresar: ");
        int valor = sc.nextInt();

        String [] nombres = new String[valor];

        //Añadiendo valores en el Arreglo

        for(int i = 0 ; i< nombres.length; i++){
            System.out.println("Ingrese el nombre "+ (i+1)+ ": " );
            nombres[i] = sc.next();
        }
        System.out.println("NOMBRES SEPARADOS POR UN ESPACIO: ");

        for(int i = 0;i< nombres.length;i++){
            System.out.print(nombres[i]+" ");
        }








    }
}