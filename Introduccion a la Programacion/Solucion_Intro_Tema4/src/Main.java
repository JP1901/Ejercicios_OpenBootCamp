public class Main {
    public static void main(String[] args) {
        int numeroIf = -21;
        int numeroWhile = -5;

        System.out.println("SOLUCION 1: IF - ELSE");
        if(numeroIf>0){
            System.out.println("POSITIVO");
        } else if (numeroIf<0) {
            System.out.println("NEGATIVO");
        } else{
            System.out.println("EL NUMERO ES 0");
        }
        System.out.println("\nSOLUCION 2: WHILE");
        while(numeroWhile<3){
            System.out.println("Valor: "+numeroWhile);
            numeroWhile++;
        }

        System.out.println("\nSOLUCION 3: DO-WHILE");
        do{
            System.out.println("valor: " + numeroWhile);
            numeroWhile += 20; //INCREMENTO EN 20 PARA QUE SOLO SE EJECUTE UNA VEZ;

        }while(numeroWhile<3);

        System.out.println("\nSOLUCION 4: FOR");

        for(int numeroFor  = 0; numeroFor <= 3 ; numeroFor++ ){
            System.out.println("numeroFor vale: "+ numeroFor);

        }

        System.out.println("\nSOLUCION 5: SWITCH");
        String estacion = "OTOÑO";
        switch (estacion){

            case "PRIMAVERA":
                System.out.println("ESTAMOS EN PRIMAVERA");
                break;
            case "VERANO":
                System.out.println("ESTAMOS EN VERANO");
                break;
            case "OTOÑO":
                System.out.println("ESTAMOS EN OTOÑO");
                break;
            case "INVIERNO":
                System.out.println("ESTAMOS EN INVIERNO");
                break;
            default:
                System.out.println("ESTACIÓN NO VALIDA.");


        }
    }
}