package polymorphism;

public class Monitor {

    //here we create 2 fields to define resolution
    private int height = 3840;
    private int width = 1920;

    // user shouldn't put every value as height and width, so e.g. in constructor, or setter, so we create 2 methods
    // to set high and low resolution

    void setLowResolution(){
        height = 800;
        width = 600;
    }

    void setHighResolution(){
        height = 3840;
        width = 1920;
    }

    //we need also method to show resolution in readable way
    public String getResolution(){
        return height + "x" + width;

    }



}


