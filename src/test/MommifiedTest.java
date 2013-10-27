import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: alacerda
 * Date: 10/24/13
 * Time: 11:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class MommifiedTest {

    private Mommy mommy;

    @Before
    public void setUp() {
        mommy = new Mommy();
    }

    @Test
    public void shouldReturnEmptyString() {
        String mommified = mommy.mommify("");
        assertEquals(mommified, "");
    }

    @Test
    public void shouldReturnTheSameWhenNoVowel() {
        String mommified = mommy.mommify("qtpdknx");
        assertEquals(mommified, "qtpdknx");
    }

    @Test
    public void shouldReturnTheSameWhenLessThan30PercentVowels() {
        String mommified = mommy.mommify("hummmm");
        assertEquals(mommified, "hummmm");
    }

    @Test
    public void shouldMommifyWhenMoreThan30PercentVowels() {
        String momified = mommy.mommify("his");
        assertEquals(momified, "hmommys");
    }

    @Test
    public void shouldMommifyOnceWhenTwoContinuousVowels() {
        String momified = mommy.mommify("heare");
        assertEquals(momified, "hmommyrmommy");
    }
}
