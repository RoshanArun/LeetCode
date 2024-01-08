
import java.util.ArrayList;
import java.util.List;

class Gamer {
    // Gamer properties and methods
}

class Dev {
    // Dev properties and methods
}

class Game {
    // Game properties and methods
}

class Review {
    // Review properties and methods
}

class ReviewManagement {
    private List<Review> rev;

    public ReviewManagement() {
        this.rev = new ArrayList<>();
    }

    public void createReview(Gamer gamer, Game game, String content, int rating) {
        // Add the new review to the reviews list
        Review newRev = new Review();
        rev.add(newRev);

        // Print some output or log the action
        System.out.println("Review: " + newRev);
    }
}

class DevManagement {
    private List<Dev> developers;

    // Other properties and methods related to Dev management
}

class GameManagement {
    private List<Game> games;

    // Other properties and methods related to Game management
}

class GamerManagement {
    private List<Gamer> gamers;

    // Other properties and methods related to Gamer management
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
