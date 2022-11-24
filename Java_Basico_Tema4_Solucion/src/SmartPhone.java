public class SmartPhone extends SmartDevice{
    String simOperator;
    int quantityCamera;

    public SmartPhone(){}

    public SmartPhone(String brand, String model, double screenSize, int memoryCapacity, int batteryCapacity, boolean lockStatus, String simOperator, int quantityCamera) {
        super(brand, model, screenSize, memoryCapacity, batteryCapacity, lockStatus);
        this.simOperator = simOperator;
        this.quantityCamera = quantityCamera;
    }
}
