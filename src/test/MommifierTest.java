import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/24/13
 * Time: 1:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class MommifierTest {

    private Mommifier mommifier;

    @Before
    public void setup() {
        mommifier = new Mommifier();
    }

    @Test
    public void shouldNotMommifyEmptyString() {
        mommifier = new Mommifier();
        String mommified = mommifier.mommify("");
        assertEquals("", mommified);
    }

    @Test
    public void shouldNotMommifyStringWithNoVowels()
    {
        String mommified = mommifier.mommify("hmm");
        assertEquals("hmm", mommified);
    }

    @Test
    public void shouldNotMommifyStringWithLessThanOrEqualTo30PercentVowels()
    {

        String mommified = mommifier.mommify("hefdsb");
        assertEquals("hefdsb",mommified);

        mommified = mommifier.mommify("hearingwww");
        assertEquals("hearingwww", mommified);
    }

    @Test
    public void shouldMommifyStringWithGreaterThan30PercentVowels()
    {
        String mommified = mommifier.mommify("here");
        assertEquals("hmommyrmommy",mommified);

    }

    @Test
    public void shouldNotInsertMultipleMommiesWhenContiguousVowels() {
        String mommified = mommifier.mommify("hear");
        assertEquals("hmommyr", mommified);
    }


}
