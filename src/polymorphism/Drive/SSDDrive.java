package polymorphism.Drive;

import polymorphism.File;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SSDDrive implements Drive {


    Map<String, File> files = new HashMap<>();

    @Override //we override methods from interface
    public void addFile(File file) {
        files.put(file.toString(), file);

    }

    @Override
    public void listFiles() {  //to list files, we take all values from the map and we put it in collection
        Collection<File> fileCollection = files.values();

        //later we iterate over every value in collection and we print the name of every file

        for (File file : fileCollection) {
            System.out.println(file.getName());
        }

    }

    @Override
    public File findFile(String name) {    //we take our map and from map we take file with given name
        return files.get(name);

    }


}
