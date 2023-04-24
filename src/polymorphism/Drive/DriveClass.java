package polymorphism.Drive;

import polymorphism.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriveClass {
//
//    private String type;

    //at first we create incorect code - we want have here 2 types of drive ssd and hdd

//    List<File> hddFile = new ArrayList<>();
//    Map<String, File> ssdFile = new HashMap<>();
//
//    public DriveClass(String type) {
//        this.type = type;
//    }

    // we also need a method to add files

//    public void addFile(File file) {
//        if (type.equals("HDD")) {
//            hddFile.add(file);
//        } else if (type.equals("SSD")) {
//            ssdFile.put(file.toString(), file);
//        }
//    }

    //but solution in this class is not so good - when want to add new type of drive we have to change all the methods
    // is better to create interface


}
