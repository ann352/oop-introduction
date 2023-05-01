package polymorphism.usbdevice;

public class Mouse implements USBDevice {

    private String name;

    public Mouse(String name){
        this.name = name;
    }

    @Override
    public boolean connected() {
        System.out.println("Mouse connected");
        return true;
    }

    @Override
    public boolean disconnected() {
        System.out.println("Mouse disconnected");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
