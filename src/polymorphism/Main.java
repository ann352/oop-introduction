package polymorphism;

import polymorphism.Drive.Drive;
import polymorphism.Drive.HDDDrive;
import polymorphism.Drive.SSDDrive;
import polymorphism.files.File;
import polymorphism.files.imagefile.GIFImageFile;
import polymorphism.files.imagefile.JPGImageFile;
import polymorphism.files.musicfile.MP3MusicFile;
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
//        drive.addFile(new File());
//        drive.addFile(new File("music.jpg"));
        drive.listFiles();

        //and no matter if we use here HDDDrive, or SSDrive it works in the same way - it is also no problem to add new type of drive
        //this is the way how interfaces work, and when we implement given interface, we should implements all its methods
        // the main idea is to create an elastic code

        //now we can test our USB devices and create 2 object from class that pmlements this interface

        MemoryStick memoryStick = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Mouse");

        //we add those 2 devices
        computer.addUSBDevice(memoryStick);
        computer.addUSBDevice(mouse);

        //and we remove
        memoryStick.eject(); //without proper type of access we cant find this method
        computer.removeUSBDevice(memoryStick);
        computer.removeUSBDevice(mouse);

        // we use below new version of code with common  method placed in abstract classes

        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 100, 80);
        MP3MusicFile mp3MusicFile = new MP3MusicFile(200, "plik.MP3", 200, "David Guetta", "Koko");

        HDDDrive drive2 = new HDDDrive(); // we can put here also Drive object instead SSDDrive drive2 = new SSDDrive();
        // or HDDDrive();
        drive2.addFile(gif1);
        drive2.addFile(jpg1);
        drive2.addFile(mp3MusicFile);

        drive2.listFiles();

        File drive2File = drive2.findFile("plik.MP3");
        System.out.println(drive2File.getSize()); // in this line we have null pointer exceptiom
        //so we have to check what is wrong with debugger, and we set breakpoint at 59 line
        // and we run our code in debug mode, we stop on 59 line and we chose F7 to go into this method -> Alt + shift + F8,
        // or evaluate expression

    }



}
