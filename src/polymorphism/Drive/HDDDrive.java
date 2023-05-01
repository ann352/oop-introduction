package polymorphism.Drive;

import polymorphism.files.File;

import java.util.ArrayList;
import java.util.List;

public class HDDDrive implements Drive {

    private List<File> files = new ArrayList<>();


    @Override
    public void addFile(File file) {
        files.add(file);

    }

    @Override
    public void listFiles() {

        for (File file : files) {
            System.out.println(file.getName());  //here we don't use on file -> method .toString() because it is implemented in sout

        }
    }

    @Override
    public File findFile(String name) {
//        Optional<File> foundFile = files.stream()
//                .filter(file -> file.getName().equals(name))
//                .findFirst();
//        return foundFile.orElseThrow();  //this elements doesn't work in code
        return null;
    }
}

