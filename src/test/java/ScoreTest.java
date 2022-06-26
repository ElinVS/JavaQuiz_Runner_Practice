import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreTest {


    @Test
    public void currentScore(){
        Score score = new Score();
        assertEquals(0, score.getScore());
    }

    @Test
    public void addToScore(){

    }

}
