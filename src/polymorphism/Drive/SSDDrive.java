package polymorphism.Drive;

import polymorphism.files.File;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SSDDrive implements Drive {


    private Map<String, File> files = new HashMap<>();

    @Override //we override methods from interface
    public void addFile(File file) {
        files.put(file.getName(), file);
        // due inserting new object by usingmethod .toString() we had npe here -> files.put(file.toString(), file);
        // and later we couldn't find proper file by name

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
    // we see here method get() which returns from map 'files' by using key 'name' -> its value
    // now we can look what is happen in this map by clicking on her name -> Alt + shift + F8
    // now we see that in map we passes no name of key, but we use calling method toString() on the object -> we have to improve it
    // we have to fix it in method add()
        // after checking what is wrong we can turn off debug by clicking red square

    }


}
