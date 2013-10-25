package test;

import main.Mommifier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/24/13
 * Time: 11:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class MommifyTest {

    private Mommifier mommifier;

    @Before
    public void setUp() {
        mommifier = new Mommifier();
    }

    @Test
    public void shouldReturnEmptyStringWhenInputIsEmpty() {
        String expected = "";
        String result = mommifier.mommify("");
        assertEquals(expected, result);
    }

    @Test
    public void shouldNotMommifyWhenLessThan30Percent() {
        String input1 = "hearrrr";
        String result1 = mommifier.mommify(input1);
        assertEquals(input1, result1);
    }

    @Test
    public void shouldMommifyWhenMoreThan30Percent(){
        String input2 = "hearhearhear";
        String result2 = mommifier.mommify(input2);
        assertEquals("hmommyrhmommyrhmommyr", result2);
    }

}
