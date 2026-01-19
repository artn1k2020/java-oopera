import java.util.ArrayList;
import java.util.List;

public class Show {
    protected final String title;
    protected final int duration;
    protected final Director director;
    protected final List<Actor> listOfActors;

    public Show(String title, int duration, Director director, List<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>(listOfActors);
    }

    public String getTitle() { return title; }
    public int getDuration() { return duration; }
    public Director getDirector() { return director; }

    public void printDirectorInfo() {
        System.out.println("Режиссёр: " + director); // director.toString() -> имя фамилия
    }

    public void printActors() {
        System.out.println("Актёры спектакля \"" + title + "\":");
        if (listOfActors.isEmpty()) {
            System.out.println("  (пока нет актёров)");
            return;
        }
        for (Actor a : listOfActors) {
            System.out.println("  - " + a); // Actor.toString() -> имя фамилия (рост)
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Предупреждение: актёр " + actor + " уже есть в спектакле \"" + title + "\".");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActorBySurname(String surnameToReplace, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Предупреждение: актёр с фамилией \"" + surnameToReplace
                + "\" не найден в спектакле \"" + title + "\".");
    }
}
