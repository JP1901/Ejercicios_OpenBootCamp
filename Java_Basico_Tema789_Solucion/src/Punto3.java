import java.util.Vector;

public class Punto3 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        System.out.println(vector);
        vector.remove(1);
        vector.remove(2);
        System.out.println("ELIMINAMOS EL 2DO Y 3ER ELEMENTO: "+vector);

    }
}
