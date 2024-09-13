package BowlingGameTest_Kata;

import BowlingGame_Kata.Game;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class GameTest {

    private static Game game;

    @BeforeEach
    public void setUp(){
        game = new Game();
    }


@Test
    public void canScoreGutterGame(){
//        roll(20, 0);
    game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
    assertThat(game.score()).isEqualTo(0);
}

  @Test
    public void canScoreGameOfOnes(){
        game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertThat(game.score()).isEqualTo(20);
    }

    @Test
    public void canScoreSpareFollowedbyThree(){
        game.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score()).isEqualTo(16);

    }

    @Test
    public void canScoreStrikeFollowedbyThreeandThree(){
        game.roll(10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score()).isEqualTo(22);
    }

    @Test
    public void canScorePerfectGame(){
        game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertThat(game.score()).isEqualTo(300);
    }
}
