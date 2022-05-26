public class PhoneBuilder{
    private String os, processor, manufacturer;
    private int ram, battery, camera;

    public PhoneBuilder setProcessor(String processor){
        this.processor = processor;
        return this;
    }
    public PhoneBuilder setOs(String os){
        this.os = os;
        return this;
    }
    public PhoneBuilder setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
        return this;
    }

    public PhoneBuilder setRam(int ram){
        this.ram = ram;
        return this;
    }
    public PhoneBuilder setBattery(int battery){
        this.battery = battery;
        return this;
    }
    public PhoneBuilder setCamera(int camera){
        this.camera = camera;
        return this;
    }
    //Returns instance of the class
    public PhoneBuilder getInstance(){
        return this;
    }

    @Override
    public String toString(){
        return "Phone Specs:" + "\nOS : " + this.os + "\nProcessor : " + this.processor + "\nBattery : " + this.battery + "\nCamera : " + this.camera + "\nManufacturer : " + this.manufacturer + "\nRAM : " + this.ram +"gb";
    }
}