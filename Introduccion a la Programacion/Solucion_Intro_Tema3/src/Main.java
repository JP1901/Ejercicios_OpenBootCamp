public class Main {
    public static void main(String[] args) {
        System.out.println("PRIMERA PARTE");
        var resultado = sumarTres(10, 12, 5);
        System.out.println(resultado);


        //POR NATURALEZA ELCOCHE TIENE 4 PUERTAS, LE AÑADO UNA LLAMANDO AL METODO
        // Y DEBE GENERARME 5.
        System.out.println("SEGUNDA PARTE");
        Coche miCoche = new Coche();
        miCoche.aumentoPuerta();

        System.out.println(miCoche.nPuertas);
    }

    public static int sumarTres(int a, int b, int c) {
        return a + b + c;
    }
}



class Coche{
    int nPuertas=4;
     public void aumentoPuerta(){
        this.nPuertas++;
    }

}