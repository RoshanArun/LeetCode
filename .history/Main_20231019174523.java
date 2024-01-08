
import java.util.ArrayList;
import java.util.List;

class Gamer {
    // gamer data
}

class Dev {
    // Dev data
}

class Game {
    // Game data
}

class Review {
    // Review data
}

class ReviewManagement {
    private List<Review> rev;

    public ReviewManagement() {
        this.rev = new ArrayList<>();
    }

    public void createReview(Gamer gamer, Game game, String content, int rating) {
        Review newRev = new Review();
        rev.add(newRev);
        System.out.println("Review: " + newRev);
    }
}

class DevManagement {
    private List<Dev> developers;

    // Dev Management Data
}

class GameManagement {
    private List<Game> games;

    // Game Management Data
}

class GamerManagement {
    private List<Gamer> gamers;

    // Gamer Management Data
}

public class Main {
    public static void main(String[] args) {
        // Instantiate your control classes
        ReviewManagement revManage = new ReviewManagement();
        DevManagement devManage = new DevManagement();
        GameManagement gameManage = new GameManagement();
        GamerManagement gamerManage = new GamerManagement();

        // Sample scenario: creating a review
        Gamer sampleGamer = new Gamer();
        Game sampleGame = new Game();

        revManage.createReview(sampleGamer, sampleGame, "Game was Satisfactory.", 3);

    }
}
