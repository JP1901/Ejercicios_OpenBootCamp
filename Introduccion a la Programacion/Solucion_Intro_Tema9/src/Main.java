public class Main {
    public static void main(String[] args) {
        Cliente objCliente = new Cliente();
        objCliente.setEdad(38);
        objCliente.setNombre("JEFFERSON FARFÁN");
        objCliente.setTelefono(972846931);
        objCliente.setCredito(4000);

        System.out.println("MI NOMBRE ES: " +objCliente.getNombre());
        System.out.println("MI EDAD ES: "+objCliente.getEdad());
        System.out.println("MI TELEFONO ES: "+objCliente.getTelefono());
        System.out.println("MI CREDITO ES: "+objCliente.getCredito());

        Trabajador objTrabajador = new Trabajador();
        objTrabajador.setSalario(2500.99);
        System.out.println("MI SALARIO ES: "+objTrabajador.getSalario());


    }
}

class Persona{
    int edad;
    String nombre;
    long telefono;

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre() { return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public long getTelefono(){return telefono;}
    public void setTelefono(long telefono){this.telefono=telefono;}
}

class Cliente extends Persona{

    public Cliente (){
        System.out.println("SOY DE LA CLASE CLIENTE");
    }
    int credito;
    public int getCredito(){
        return credito;
    }
    public void setCredito(int credito){
        this.credito=credito;
    }
}

class Trabajador extends Persona{

    public Trabajador (){
        System.out.println("SOY DE LA CLASE TRABAJADOR");
    }
    double salario;

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}

