package polymorphism.files.musicfile;

import polymorphism.files.File;

public interface MusicFile extends File { // one interface extends another -> not implements

    void play(); //we add for music files new method play
}
