import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: dhruvk
 * Date: 25/10/13
 * Time: 6:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class MommifierTest
{

    private final String MOMMY = "mommy";
    private Mommifier mommifier;

    @Before
    public void setup()
    {
        mommifier = new Mommifier();
    }

    @Test
    public void shouldNotChangeTheEmptyString()
    {
        String emptyString = "";

        assertEquals(emptyString, mommifier.mommify(emptyString));
    }

    @Test
    public void shouldChange_a_ToMommy()
    {
        String vowel = "a";

        assertEquals(MOMMY, mommifier.mommify(vowel));
    }

    @Test
    public void shouldChange_aaa_ToMommy()
    {
        String word = "aaa";

        assertEquals(MOMMY, mommifier.mommify(word));
    }

    @Test
    public void shouldNotChange_ahhh()
    {
        String word = "ahhh";

        assertEquals(word, mommifier.mommify(word));
    }

    @Test
    public void shouldChange_aba_To_mommybmommy()
    {
        String word = "aba";

        assertEquals(MOMMY + "b" + MOMMY, mommifier.mommify(word));
    }

    @Test
    public void shouldChange_aeiou_To_mommy()
    {
        String word = "aeiou";

        assertEquals(MOMMY, mommifier.mommify(word));
    }
}
