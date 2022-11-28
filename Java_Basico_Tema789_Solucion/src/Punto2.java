public class Punto2 {
    //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y
    // el valor de cada elemento en ambas dimensiones.
    public static void main(String[] args) {
        int [][] numeros = new int[3][3];

        numeros[0][0]=1;
        numeros[0][1]=2;
        numeros[0][2]=3;
        numeros[1][0]=10;
        numeros[1][1]=20;
        numeros[1][2]=30;
        numeros[2][0]=100;
        numeros[2][1]=200;
        numeros[2][2]=300;


      for (int i = 0; i<numeros.length; i++){

          for (int j = 0; j < numeros.length; j++){
              System.out.println("Posicion: "+ i+","+j + " Valor: "+numeros[i][j]);
          }

      }


    }
}
