package polymorphism.files.imagefile;

//here we create new class that implements interface File
// we should implement methods from the interface and create proper fields
// we should also create constructor - we wrote names of parameters and click alt + enter on the fields
// and chose 'bind parameters option'
// but we  have some identical fields and methods in class GIFImageFile and JPGImageFile
// so better solution is to move that code to abstract class in case not duplicate code


public class GIFImageFile extends AbstractImageFile {

    public GIFImageFile(String name, int size){   //we use here constructor form abstract class
        super(name,size);
    }

    //separate method for GIF file -> remember about type of access
    public void showAnimation(){
        System.out.println("Showing funny animation");
    }
}
