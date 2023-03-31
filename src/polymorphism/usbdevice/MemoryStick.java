package polymorphism.usbdevice;

public class MemporyStick implements USBDevice {
    @Override
    public boolean connected() {
        return false;
    }

    @Override
    public boolean disconnected() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}
