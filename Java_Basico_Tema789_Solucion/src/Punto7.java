public class Punto7 {
    public static void main(String[] args) {
        DividePorCero(4,0);
    }

    static int DividePorCero (int a, int b) throws ArithmeticException{
        int resultado=0;
        try {
            resultado = a/b;
        } catch (ArithmeticException e){
            System.out.println("ESTO NO PUEDE HACERSE");
        } finally {
            System.out.println("DEMO DE CODIGO");

        }
        return resultado;

    }
}
