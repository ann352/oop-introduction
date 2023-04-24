package polymorphism;

import polymorphism.Drive.Drive;
import polymorphism.usbdevice.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private Monitor monitor;
    private Drive drive;   //when we add to the field - final, the field is only to read and it's initialized once - by constructor
    private Headphones headphones;  //we add type of access to the field

    List<USBDevice> usbDevices = new ArrayList<>();
   //list of objects that implements interface USBDevices
    // at first I have forgotten to initialize that list


    public Computer(Monitor monitor, Drive drive) { //we can use here alt+enter and chose option bind paramteres with fields
        this.monitor = monitor;
        this.drive = drive;
    }


    public Monitor getMonitor() {  //we create getters and setters for some fields
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    } // method that help us to get a list of all USB devices

    public void addUSBDevice(USBDevice usbDevice) {
        boolean isConnected = usbDevice.connected(); // here on USB device we call method connected
        if (isConnected) {   // and if USB device is connected (boolean isConnected = true) then we can add new device
            System.out.println("USB device connected");
            usbDevices.add(usbDevice);
        }
    } // method that add new USB device

//    public void removeUSBDevice(USBDevice usbDevice) {
//        boolean isDisconnected = usbDevice.disconnected();
//
//        if (isDisconnected) {
//            System.out.println("USB device removed");
//            usbDevices.remove(usbDevice);
//        } else {
//            System.out.println("Forcibly removed USB device");
//            usbDevices.remove(usbDevice);
//        }
//    }

    //in this method we always use usbDevices.remove(usbDevice) - doesn't matter if usb is discnected or not
    // so better is to write it - that way - on the end, because USB device we always remove,
    // and message about forcibly removing should be shown only when we make it by force

//    public void removeUSBDevice(USBDevice usbDevice) {
//        boolean isDisconnected = usbDevice.disconnected();
//        if (!isDisconnected) {
//            {
//                System.out.println("Forcibly removed USB device");
//            }
//            usbDevices.remove(usbDevice);
//        }
//    }


    public void removeUSBDevice(USBDevice usbDevice) {
        boolean isDisconnected = usbDevice.disconnected();
        if (isDisconnected) {
            usbDevices.remove(usbDevice);
        }
    }

}
