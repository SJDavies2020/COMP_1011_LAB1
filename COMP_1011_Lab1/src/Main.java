import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CANADA);

        Game game1 = new Game("Lode Runner","2020",false, LocalDate.of(2021,5,5),"2D Platformer",49.99);
        Game game2 = new Game("Escape From Ontario","2020",false, LocalDate.of(2021,5,5),"FPS",89.99);

        System.out.printf("Game 1: %s%n", game1.toString());
        System.out.printf("Game 1: Is Published?" + game1.isPublished() + " \n") ;
        System.out.printf("Game 1: Publish Year: " + game1.getPublishYear().toString() + " \n") ;
        System.out.printf("Game 1: Type: " + game1.getGameType().toString() + " \n") ;
        System.out.printf("Game 1: Price: " + format.format(game1.getGamePrice()) + " \n");
        System.out.printf(" \n") ;
        System.out.printf("Game 2: %s%n", game1.toString());
        System.out.printf("Game 2: Is Published?" + game1.isPublished() + " \n") ;
        System.out.printf("Game 2: Publish Year: " + game1.getPublishYear().toString() + " \n") ;
        System.out.printf("Game 2: Type: " + game1.getGameType().toString() + " \n") ;
        System.out.printf("Game 2: Price: " + format.format(game1.getGamePrice()) + " \n");
    }
}
