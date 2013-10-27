package test;

import main.VowelCalculations;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/27/13
 * Time: 4:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class VowelCalculationsTest {

    char[] listOfVowels = new char[] {'a', 'e', 'i', 'o', 'u'};
    VowelCalculations vowelCalculation;
    String testPhrase1 = "abcdefghijklmno";
    String testPhrase2 = "aloogobi";

    @Before
    public void setUp() {
        vowelCalculation = new VowelCalculations();
    }
    @Test
    public void shouldReturnWhetherCharacterIsVowel() {
        assertThat(vowelCalculation.isVowel('o'), is(true));
        assertThat(vowelCalculation.isVowel('d'), is(false));
    }

    @Test
    public void shouldReturnNumberOfVowels() {
        assertThat(vowelCalculation.findNumberOfVowels(testPhrase1), is(4));
    }

    @Test
    public void shouldCheckThatPercentageOfVowelExceeds30() {
        assertThat(vowelCalculation.doesVowelCountExceed30Percent(testPhrase1), is(false));
        assertThat(vowelCalculation.doesVowelCountExceed30Percent(testPhrase2), is(true));

    }

}
