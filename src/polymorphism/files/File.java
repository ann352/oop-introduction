package polymorphism.files;

//we create here interface File
public interface File {

    //here we can create 3 methods
    String getName();
    int getSize();
    FileType getFileType(); //we created FileType later - it would be enum

}
