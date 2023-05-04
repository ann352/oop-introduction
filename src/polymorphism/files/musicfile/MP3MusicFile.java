package polymorphism.files.musicfile;

//we creeate also one conrete class in which should be implemented all methods

public class MP3MusicFile extends AbstractMusicClass{

    // we generate constructor with all needed fields

    private int quality;

    public MP3MusicFile(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);
        this.quality = quality;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 file");
    }

    @Override
    public String getName() {
    //return super.getName();  -> by deafault we have here calling from base class -> super() instruction
        return "Plik nazywa się " + super.getName(); //    wrong -> stackOverflowError ->    return "Plik nazywa się" + getName();
    }

    public int getQuality() {
        return quality;
    }

    //example how to generate toString() method
    @Override
    public String toString() {
        return "MP3MusicFile{" +
                "bandName='" + bandName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }




}
