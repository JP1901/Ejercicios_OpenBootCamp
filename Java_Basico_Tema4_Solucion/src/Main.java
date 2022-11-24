public class Main {
    public static void main(String[] args) {
        SmartDevice objSmartDevice = new SmartDevice("Samsung","Tablet",10.6,128,1042,false);
        SmartPhone objSmartPhone = new SmartPhone("Apple","iPhone 11", 6.06, 64, 1030,false,"Movistar",2 );
        SmartWatch objSmartWatch = new SmartWatch("Xiaomi","Mi Watch X1",1.78,16,423,true,5);

        //SMARTPHONE
        System.out.println("CARACTERÍSTICAS DE UN SMARTDEVICE");
        System.out.println("La marca es: "+objSmartDevice.brand);
        System.out.println("El modelo es: "+objSmartDevice.model);
        System.out.println("El tamaño de la pantalla es: "+objSmartDevice.screenSize);
        System.out.println("Capacidad de Memoria: "+objSmartDevice.memoryCapacity);
        System.out.println("Capacidad de Batería: "+objSmartDevice.batteryCapacity);
        if(objSmartDevice.lockStatus==true){
            System.out.println("Estado: BLOQUEADO");
        }else {
            System.out.println("Estado: DESBLOQUEADO");
        }

        //SMARTPHONE
        System.out.println("\nCARACTERÍSTICAS DE UN SMARTPHONE");
        System.out.println("La marca es: "+objSmartPhone.brand);
        System.out.println("El modelo es: "+objSmartPhone.model);
        System.out.println("El tamaño de la pantalla es: "+objSmartPhone.screenSize);
        System.out.println("Capacidad de Memoria: "+objSmartPhone.memoryCapacity);
        System.out.println("Capacidad de Batería: "+objSmartPhone.batteryCapacity);
        if(objSmartPhone.lockStatus==true){
            System.out.println("Estado: BLOQUEADO");
        }else {
            System.out.println("Estado: DESBLOQUEADO");
        }
        System.out.println("Operador de SIM: "+objSmartPhone.simOperator);
        System.out.println("Cantidad de Cámaras: "+objSmartPhone.quantityCamera);

        //SMARTWATCH
        System.out.println("\nCARACTERÍSTICAS DE UN SMARTWATCH");
        System.out.println("La marca es: "+objSmartWatch.brand);
        System.out.println("El modelo es: "+objSmartWatch.model);
        System.out.println("El tamaño de la pantalla es: "+objSmartWatch.screenSize);
        System.out.println("Capacidad de Memoria: "+objSmartWatch.memoryCapacity);
        System.out.println("Capacidad de Batería: "+objSmartWatch.batteryCapacity);
        if(objSmartWatch.lockStatus==true){
            System.out.println("Estado: BLOQUEADO");
        }else {
            System.out.println("Estado: DESBLOQUEADO");
        }
        System.out.println("Numero de Indicadores: "+objSmartWatch.numberAlarms);
    }
}