package polymorphism;

public interface Drive {

    //to not duplicate method for SSD drive i HDD dirive, better is to create interface
    void addFile(File file);
    void listFile();
    File findFile();
}
