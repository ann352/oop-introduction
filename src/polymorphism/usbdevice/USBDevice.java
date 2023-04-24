package polymorphism.usbdevice;

public interface USBDevice {

    boolean connected();
    boolean disconnected();
    String getName();
}
