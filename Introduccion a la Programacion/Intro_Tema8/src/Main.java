public class Main {
    public static void main(String[] args) {
        Persona objPersona = new Persona();
        objPersona.setEdad(24);
        objPersona.setNombre("Jose");
        objPersona.setTelefono(939285112);

        System.out.println("EL NOMBRE ES: "+ objPersona.getNombre());
        System.out.println("LA EDAD ES: "+ objPersona.getEdad());
        System.out.println("EL TELEFONO ES: "+objPersona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private long telefono;

    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getEdad (){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setTelefono(long telefono){
        this.telefono=telefono;
    }

    public long getTelefono(){
        return telefono;
    }
}
