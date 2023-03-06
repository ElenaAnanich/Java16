import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void test1() {
        Game game = new Game();
        Player player1 = new Player(1, "Ivan", 16);
        Player player2 = new Player(2, "Mari", 14);

        game.register(player1);
        game.register(player2);

        int actual = game.round("Ivan", "Mari");
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        Game game = new Game();
        Player player1 = new Player(1, "Ivan", 16);
        Player player2 = new Player(2, "Mari", 22);

        game.register(player1);
        game.register(player2);

        int actual = game.round("Mari", "Ivan");
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test3() {
        Game game = new Game();
        Player player1 = new Player(1, "Ivan", 22);
        Player player2 = new Player(2, "Mari", 22);

        game.register(player1);
        game.register(player2);

        int actual = game.round("Ivan", "Mari");
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test4() {
        Game game = new Game();
        Player player1 = new Player(1, "Ivan", 22);
        Player player2 = new Player(2, "Mari", 22);

        game.register(player1);
        game.register(player2);


        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Maks", "Mari");
        });
    }

    @Test
    public void test5() {
        Game game = new Game();
        Player player1 = new Player(1, "Ivan", 22);
        Player player2 = new Player(2, "Mari", 22);

        game.register(player1);
        game.register(player2);


        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Ivan", "Maks");
        });
    }

    @Test
    public void test6() {
        Game game = new Game();
        Player player1 = new Player(1, "Ivan", 22);
        Player player2 = new Player(2, "Mari", 26);

        game.register(player1);
        game.register(player2);

        int actual = game.round("Ivan", "Mari");
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }
}