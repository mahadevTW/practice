import Game.GameLauncher;
import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by mahadev on 13/5/16.
 */
public class GameLauncherTest {
    @Test
    public void multiplyShouldReturnProdOfTwoNumbers(){
        GameLauncher gameLauncher = new GameLauncher();
        int result = gameLauncher.multiply(3,5);
        TestCase.assertEquals(result, 15);
    }

}