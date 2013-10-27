import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/27/13
 * Time: 6:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class VowelReplacerTest {

    @Test
    public void shouldGetVowelPercentage() {
        VowelReplacer vowelReplacer = new VowelReplacer("hello", "mommy");
        assertThat(vowelReplacer.calculatePercentVowels(), is(40));

        vowelReplacer = new VowelReplacer("wonderful", "mommy");
        assertThat(vowelReplacer.calculatePercentVowels(), is(33));
    }

    @Test
    public void shouldReplaceVowelsWithTargetString() {
        VowelReplacer vowelReplacer = new VowelReplacer("hello", "mommy");
        String stringReplaced = vowelReplacer.replaceVowels();
        assertThat(stringReplaced, is("hmommyllmommy"));
    }

    @Test
    public void shouldReplaceContiguousVowelsWithOneTargetString() {
        VowelReplacer vowelReplacer = new VowelReplacer("hear", "mommy");
        String stringReplaced = vowelReplacer.replaceVowels();
        assertThat(stringReplaced, is("hmommyr"));
    }

    @Test
    public void shouldNotReplaceStringWithNoVowel() {
        VowelReplacer vowelReplacer = new VowelReplacer("hmm", "mommy");
        String stringReplaced = vowelReplacer.replaceVowels();
        assertThat(stringReplaced, is("hmm"));
    }


}
