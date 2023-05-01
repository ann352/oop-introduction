package polymorphism.usbdevice;

public class MemoryStick implements USBDevice {

    private String name;
    private boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean connected() {
        System.out.println("Memory stick connected");
        return true;
    }

    @Override
    public boolean disconnected() {
        if(!ejected){
            System.out.println("Please eject the device first");
        }
        else{
            System.out.println("Memory stick disconnected");
            return true;
        }

        return false;
    }

    @Override
    public String getName() {
        return name;
    }


    public boolean eject(){
        System.out.println("Ejecting Memory Stick");
        return ejected = true;
    }

    //method ejected() was absent in interface but it is normal to add additional method in class implements interface
}
