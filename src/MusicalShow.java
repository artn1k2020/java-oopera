import java.util.List;

public class MusicalShow extends Show {
    private final Person musicAuthor;
    private final String librettoText;

    public MusicalShow(String title, int duration, Director director, List<Actor> listOfActors,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public Person getMusicAuthor() { return musicAuthor; }
    public String getLibrettoText() { return librettoText; }

    public void printLibretto() {
        System.out.println("Либретто спектакля \"" + getTitle() + "\":");
        System.out.println(librettoText);
    }
}
