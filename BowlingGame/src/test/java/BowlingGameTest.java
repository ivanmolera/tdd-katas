import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ivanmolera on 09/03/2018.
 */
public class BowlingGameTest {

    private Game g;

    @Before
    public void setUp() throws Exception {
        g = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i=0; i<n; i++) {
            g.roll(pins);
        }
    }

    private void rollSpare() {
        g.roll(6);
        g.roll(4);
    }

    @Test
    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        Assert.assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() throws Exception {
        rollMany(20, 1);
        Assert.assertEquals(20, g.score());
    }

    @Test
    public void testOneSpare() throws Exception {
        rollSpare();
        g.roll(3);
        rollMany(17, 0);
        Assert.assertEquals(16, g.score());
    }
}
