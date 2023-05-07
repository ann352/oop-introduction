package polymorphism.files;

//we create here interface File
public interface File {

    //here we can create 3 methods
    String getName();
    int getSize();
    FileType getFileType(); //we created FileType later - it would be enum

    //when we add new method to the interface -> int get version()
    // and we get into GIFImageFile and other classes whisch use this interface then we see an error
    // with information that we should implement new method,but what in situation when other persons already use methods from the interface
    // from java 8 we have new mechanism -> default methods in interfaces

    // so for deafault method in interface we should add word default and implements its body
    // and now if we create new object in Main class and use this method we return default result  - but it is also no problem
    // to define own method behaviour - e.g. in class GIFImagefile

    default int getVersion(){
        return 1;
    }

}
