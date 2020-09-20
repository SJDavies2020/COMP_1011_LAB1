import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Game game1 = new Game("Lode Runner","2020",false, LocalDate.of(2021,5,5),"2D Platformer",49.99);
        Game game2 = new Game("Escape From Ontario","2020",false, LocalDate.of(2021,5,5),"FPS",89.99);

        System.out.printf("Game 1: %s%n", game1.toString());
        System.out.printf("Game 2: %s%n", game2.toString());

    }
}
