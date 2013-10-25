import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Created with IntelliJ IDEA.
 * User: dhruvk
 * Date: 25/10/13
 * Time: 6:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class UtilitiesTest {


    private static final double THRESHOLD = 30.0;

    @Test
    public void aSingleVowelPassesMoreThan30PercentVowelTest()
    {
        String vowel = "a";
        assert(Utilities.percentVowel(vowel) > THRESHOLD);
    }

    @Test
    public void aWordWith1VowelAnd1ConsonantPasses30PercentVowelTest()
    {
        String word = "ab";
        assert Utilities.percentVowel(word) > THRESHOLD;
    }

    @Test
    public void aWordWith1VowelAnd2ConsnantsPasses30PercentVowelTest()
    {
        String word = "ark";
        assert Utilities.percentVowel(word) > THRESHOLD;
    }

    @Test
    public void aWordWithNoVowelsFails30PercentVowelTest()
    {
        String wordWithoutVowels = "myth";
        assertFalse(Utilities.percentVowel(wordWithoutVowels) > THRESHOLD);
    }

    @Test
    public void shouldSayThat_a_IsVowel()
    {
        assert Utilities.isVowel("a");
    }

    @Test
    public void shouldSayThat_e_IsVowel()
    {
        assert Utilities.isVowel("e");
    }

    @Test
    public void shouldSayThat_i_IsVowel()
    {
        assert Utilities.isVowel("i");
    }

    @Test
    public void shouldSayThat_o_IsVowel()
    {
        assert Utilities.isVowel("o");
    }

    @Test
    public void shouldSayThat_u_IsVowel()
    {
        assert Utilities.isVowel("u");
    }

    @Test
    public void shouldSayThat_b_IsNotVowel()
    {
        assertFalse(Utilities.isVowel("b"));
    }
}
