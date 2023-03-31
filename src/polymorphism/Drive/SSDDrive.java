package polymorphism;

import polymorphism.Drive.Drive;

import java.util.HashMap;
import java.util.Map;

public class SSDDrive implements Drive {


    Map<String, File> files = new HashMap<>();

    @Override //we override methods from interface
    public void addFile(File file) {
        files.put(file.toString(), file);

    }

    @Override
    public void listFile() {

    }

    @Override
    public File findFile() {
        return null;
    }
}
