package polymorphism.files.musicfile;

import polymorphism.files.AbstractFile;
import polymorphism.files.FileType;

public abstract class AbstractMusicClass extends AbstractFile implements MusicFile {

    //without word 'abstract' in concrete class we have to implements all the methods from interface, but in abstract class
    //we do not have to do it - e can implements only chosen methods - in our case, only methods that are common for classes
    //inherit after our abstract class

    //we can add to that class new, needed fields with smodificator protected
    // then classes from other package that inherit from AbstractClass have access to those fields
    // classes in default package private have access only to classes in the same package

    protected String bandName;
    protected String title;

    //we generate new constructor for abstract class, with protected access - only in concrete class we will use public


    protected AbstractMusicClass(String name, int size, String bandName, String title) {
        super(name, size);
        this.bandName = bandName;
        this.title = title;
    }

    @Override
    public FileType getFileType() {
        return FileType.MUSIC;
    }
}
