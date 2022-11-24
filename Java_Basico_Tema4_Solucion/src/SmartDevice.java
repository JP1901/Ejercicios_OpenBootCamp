public class SmartDevice {
    protected String brand;
    protected String model;
    protected double screenSize;
    protected int memoryCapacity;
    protected int batteryCapacity;
    protected boolean lockStatus;



    public SmartDevice(){}

    public SmartDevice(String brand, String model,double screenSize, int memoryCapacity, int batteryCapacity, boolean lockStatus){
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.memoryCapacity = memoryCapacity;
        this.batteryCapacity = batteryCapacity;
        this.lockStatus = lockStatus;
    }


}
