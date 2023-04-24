package polymorphism;

import polymorphism.Drive.SSDDrive;
import polymorphism.usbdevice.MemoryStick;
import polymorphism.usbdevice.Mouse;

public class Main {

    public static void main(String[] args) {
//        Monitor monitor = new Monitor();
//        System.out.println(monitor.getResolution());
//        monitor.setLowResolution();
//        System.out.println(monitor.getResolution());   -> elements created before implementing interface Drive

//        HDDDrive drive = new HDDDrive();
        Monitor monitor = new Monitor();
        SSDDrive drive = new SSDDrive();

        Computer computer = new Computer(monitor, drive);
        drive.addFile(new File("jnsp.jpg"));
        drive.addFile(new File("music.jpg"));
        drive.listFiles();

        //and no matter if we use here HDDDrive, or SSDrive it works in the same way - it is also no problem to add new type of drive
        //this is the way how interfaces work, and when we implement given interface, we should implements all its methods
        // the main idea is to create an elastic code

        //now we can test our USB devices and create 2 objects from this interface

        MemoryStick memoryStick = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Mouse");

        //we add those 2 devices
        computer.addUSBDevice(memoryStick);
        computer.addUSBDevice(mouse);

        //and we remove
        memoryStick.eject(); //without proper type of access we cant find this method
        computer.removeUSBDevice(memoryStick);
        computer.removeUSBDevice(mouse);


    }


}
