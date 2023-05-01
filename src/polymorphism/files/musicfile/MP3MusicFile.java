package polymorphism.files.musicfile;

//we creeate also one conrete class in which should be implemented all methods

public class MP3MusicFile extends AbstractMusicClass{

    // we generate constructor with all needed fields

    private int quality;

    public MP3MusicFile(int quality, String name, int size, String bandName, String title) {
        super(name, size, bandName, title);
        this.quality = quality;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 file");
    }

    public int getQuality() {
        return quality;
    }
}
