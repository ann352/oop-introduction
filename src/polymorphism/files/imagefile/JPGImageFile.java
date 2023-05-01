package polymorphism.files.imagefile;

import polymorphism.files.FileType;

public class JPGImageFile extends AbstractImageFile {

    //we can write here names of the fields and from those fields generate constructor

    private int compression;

    public JPGImageFile(String name, int size, int compression){
        super(name,size); //super() it MUST BE first instruction in constructor!
        this.compression = compression;  //we left here field compression and initialize it when creating new object
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public FileType getFileType() {
        return null;
    }

    public int getCompression() {
        return compression;
    }

    public void displayImage(){
        System.out.println("Displaying JPG");
    }

}
