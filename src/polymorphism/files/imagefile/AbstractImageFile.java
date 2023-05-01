package polymorphism.files.imagefile;


import polymorphism.files.AbstractFile;
import polymorphism.files.FileType;

public abstract class AbstractImageFile extends AbstractFile {
    // we add abstract to the signature of method and we implement interface File
    // we put here fields that are similar on GIF and JPG image file class

//    protected String name;
//    protected int size;

    // we add here protected specificator so elemenmts from the class can be used by inheritance;
    // we have not here field field fileType but it is returned in method getFileType()


    // in case not to add 'protected' specificator default is private package access,
    // and methods can use only classes from the same package,
    // but we want make them accessible for class which inherit and could be create in other packege


    protected AbstractImageFile(String name, int size) {
        super(name, size);

    }

    //implement methods option, and we implement it
    // we have the same fields in AbstractImageFile and AbstractMusicFile so in case not to duplicate the code
    // is create common class AbstractFile that can be extended by that class

    @Override
    public FileType getFileType() {
        return FileType.IMAGE; //we return here IMAGE because GIF and JPG are image file
    }
}
