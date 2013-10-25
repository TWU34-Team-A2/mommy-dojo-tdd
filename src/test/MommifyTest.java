import Mommifier.Mommifier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MommifyTest {
    private Mommifier mommify;
    private String mommifiedResult;

    @Before
    public void setUp() throws Exception {
        mommify = new Mommifier();
    }

    @Test
    public void shouldNotMommifyWhenEmpty() {

        mommifiedResult = mommify.mommifyInputString("");
        assertEquals("",mommifiedResult);
    }

    @Test
    public void shouldNotMommifyWhenNoVowels()  {

        mommifiedResult = mommify.mommifyInputString("hmm");
        assertEquals("hmm",mommifiedResult);
    }

    @Test
    public void shouldMommifyWhenSingleVowel(){

        mommifiedResult = mommify.replaceVowelWithMommy("his");

        assertEquals("hmommys", mommifiedResult);

    }

    @Test
    public void shouldMommifyWhenContinuousVowel(){

        mommifiedResult = mommify.replaceVowelWithMommy("hiis");

        assertEquals("hmommys", mommifiedResult);

    }

    @Test
    public void shouldBeTrueIfPercentGrt30(){

        boolean percentageGrt30 = mommify.checkPercentageGrt30(5,10);

        assertEquals(true,percentageGrt30);

    }

    @Test
    public void shouldMommifyIfPercentGrt30SingleVowel()
    {
        mommifiedResult = mommify.mommifyInputString("his");

        assertEquals("hmommys",mommifiedResult);
    }

    @Test
    public void shouldMommifyIfPercentGrt30ContinuousVowel()
    {
        mommifiedResult = mommify.mommifyInputString("hiis");

        assertEquals("hmommys",mommifiedResult);
    }

    @Test
    public void shouldMommifyIfPercentLess30()
    {
        mommifiedResult = mommify.mommifyInputString("hiss");

        assertEquals("hiss",mommifiedResult);
    }


}
