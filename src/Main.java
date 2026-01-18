import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        Actor a1 = new Actor("Артём", "Никишин", Gender.MALE, 182);
        Actor a2 = new Actor("Татьяна", "Соколова", Gender.FEMALE, 170);
        Actor a3 = new Actor("Олег", "Филимонов", Gender.MALE, 176);

        Director d1 = new Director("Сергей", "Власов", Gender.MALE, 12);
        Director d2 = new Director("Мария", "Орлова", Gender.FEMALE, 7);

        Person musicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Юрий", "Григорович", Gender.MALE);

        Show classic = new Show("Ревизор", 120, d1, List.of());
        Opera opera = new Opera(
                "Евгений Онегин", 150, d2, List.of(),
                musicAuthor,
                "История несбывшейся любви.",
                40
        );
        Ballet ballet = new Ballet(
                "Лебединое озеро", 140, d1, List.of(),
                musicAuthor,
                "Сказание о заклятии и верности.",
                choreographer
        );

        classic.addActor(a1);
        classic.addActor(a2);
        classic.addActor(a2); // проверка дубля

        opera.addActor(a2);
        opera.addActor(a3);

        ballet.addActor(a1);
        ballet.addActor(a3);

        classic.printDirectorInfo();
        classic.printActors();
        System.out.println();

        opera.printDirectorInfo();
        opera.printActors();
        System.out.println();

        ballet.printDirectorInfo();
        ballet.printActors();
        System.out.println();

        classic.replaceActorBySurname("Никишин", a3);
        classic.printActors();
        System.out.println();

        opera.replaceActorBySurname("Коровин", a1);
        System.out.println();

        opera.printLibretto();
        System.out.println();

        ballet.printLibretto();
    }
}