package polymorphism;


import polymorphism.Drive.Drive;

import java.util.ArrayList;
import java.util.List;

public class HDDDrive implements Drive {

    List<File> files = new ArrayList<>();


    @Override
    public void addFile(File file) {
        files.add(file);

    }

    @Override
    public void listFile() {

        for (File file : files){
            System.out.println(file);  //here we don't use on file -> method .toString() because it is implemented in sout

        }

    }

    @Override
    public File findFile() {
        return null;
    }
}
