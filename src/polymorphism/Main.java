package polymorphism;

import polymorphism.Drive.HDDDrive;
import polymorphism.Drive.SSDDrive;
import polymorphism.files.File;
import polymorphism.files.imagefile.GIFImageFile;
import polymorphism.files.imagefile.JPGImageFile;
import polymorphism.files.musicfile.MP3MusicFile;
import polymorphism.usbdevice.MemoryStick;
import polymorphism.usbdevice.Mouse;

import java.util.ArrayList;
import java.util.List;

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
        MP3MusicFile mp3MusicFile = new MP3MusicFile("mp3.file",150,"Lady Punk","U Maksyma w Gdynii",80);

        HDDDrive drive2 = new HDDDrive(); // we can put here also Drive object instead SSDDrive drive2 = new SSDDrive();
        // or HDDDrive();
        drive2.addFile(gif1);
        drive2.addFile(jpg1);
        drive2.addFile(mp3MusicFile);

        drive2.listFiles();

        File drive2File = drive2.findFile("plik.MP3");
//        System.out.println(drive2File.getSize()); // in this line we have null pointer exceptiom
        //so we have to check what is wrong with debugger, and we set breakpoint at 59 line
        // and we run our code in debug mode, we stop on 59 line and we chose F7 to go into this method -> Alt + shift + F8,
        // or evaluate expression

        //new informations -> methods overloading - means the same signature of method but different arguments
        // -> method overriding means -> overriding the method defined in the base class, when we want to give a new meaning to an inheriting class
        // eg. we have AbstractFile with method getName() and we have AbstractMusicFile that inherit after AbstractClass
        // and MP3MusicFile inherit also method getName() after AbstractClass
        // so for example when we create new object MP3MusicFile we can use getName() method
        MP3MusicFile mp3MusicFile1 = new MP3MusicFile("mp3.file", 100, "The cool kids of death", "Gwożdzie i butelki", 80);
        mp3MusicFile1.getName(); //in MP3MusicFile we can overide this method -> click generate and chose which method

        // we have method toString() in class Object from inherit all the Objects
        // and we can override this method with chosen fields -> example MP3MusicFile


        //instanceOf
        JPGImageFile jpgImageFile = new JPGImageFile("plik.jpg", 3, 100);
        System.out.println(jpgImageFile instanceof JPGImageFile);
        GIFImageFile gifImageFile = new GIFImageFile("plik.gif", 200);

        //now we create a list that will expect files
        List<File> files = new ArrayList<>();

        //and to the list we will add our new files
        files.add(jpgImageFile);
        files.add(gifImageFile);

        //and now if we will to ierate over our list
        for ( File file : files){
            if(file instanceof JPGImageFile){
                System.out.println("That file is a JPGImageFile");
            }
            else if(file instanceof GIFImageFile){
                System.out.println("That file is a GIFImageFile");
            }

        }

        // in Java 8 we have for interfaces default methods
        // e.g if we add new method to interface - instead of adding this method to all classes that use this interface
        // example of using ovveriden deafault method from interface

        GIFImageFile gifImageFile3 = new GIFImageFile("file3.GIF", 100);
        System.out.println(gifImageFile3.getVersion());

        // next concept -> static fields and methods -> for which we don't create an object of class with such field or such method
        // class Monitor -> to create static field we have to add 'static' description and name field with capital letters
        // we use static fields and methods in this way:

        System.out.println(Monitor.MAX_HEIGHT);
        System.out.println(Monitor.getMaxHeight());
        //those fields and methods we use usually in utils clasess e.g. when we need to calculate somethig
    }
}
