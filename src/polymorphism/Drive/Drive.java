package polymorphism.Drive;

import polymorphism.File;

public interface Drive {

    //to not duplicate the same  methods for SSD drive i HDD dirive, better is to create proper interface with methods to work with files

    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
