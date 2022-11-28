import java.util.ArrayList;
import java.util.LinkedList;

public class Punto5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("PERU");
        arrayList.add("CHILE");
        arrayList.add("ARGENTINA");
        arrayList.add("BRASIL");

        //COPIAMOS
        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        //RECORRER arrayList
        System.out.println("RECORRIENDO EL ARRAYLIST.");
        for(int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        //RECORRER linkedList
        System.out.println();
        System.out.println("RECORRIENDO EL LINKEDLIST.");
        for(int i = 0; i<linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }



    }
}
