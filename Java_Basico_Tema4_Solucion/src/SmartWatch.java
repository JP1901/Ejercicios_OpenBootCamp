public class SmartWatch extends SmartDevice{
    int numberAlarms;

    public SmartWatch(){}

    public SmartWatch(String brand, String model, double screenSize, int memoryCapacity, int batteryCapacity, boolean lockStatus, int numberAlarms) {
        super(brand, model, screenSize, memoryCapacity, batteryCapacity, lockStatus);
        this.numberAlarms = numberAlarms;
    }
}
