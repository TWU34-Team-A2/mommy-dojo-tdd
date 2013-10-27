import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/24/13
 * Time: 1:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class MommifierTest {

    VowelReplacer vowelReplacer;

    @Before
    public void setUp() {
        vowelReplacer = mock(VowelReplacer.class);
    }

    @Test
    public void shouldNotCallVowelReplacerOnEmptyString() {
        Mommifier mommifier = new Mommifier("", vowelReplacer);
        mommifier.mommify();
        verifyNoMoreInteractions(vowelReplacer);
    }

    @Test
    public void shouldNotReplaceStringWithLessThanOrEqualTo30PercentVowels()
    {
        Mommifier mommifier = new Mommifier("hefdsb", vowelReplacer);
        when(vowelReplacer.calculatePercentVowels()).thenReturn(20);
        verify(vowelReplacer, never()).replaceVowels();

        mommifier = new Mommifier("hearingwww", vowelReplacer);
        when(vowelReplacer.calculatePercentVowels()).thenReturn(30);
        verify(vowelReplacer, never()).replaceVowels();
    }

    @Test
    public void shouldCallReplaceVowelMethodWhenMoreThan30PercentVowels(){
        Mommifier mommifier = new Mommifier("here", vowelReplacer);
        when(vowelReplacer.calculatePercentVowels()).thenReturn(50);
        mommifier.mommify();
        verify(vowelReplacer).replaceVowels();
    }

    @Test
    public void shouldCallCalculateVowelMethodWhenNonEmptyString() {

        Mommifier mommifier = new Mommifier("hear", vowelReplacer);
        mommifier.mommify();
        verify(vowelReplacer).calculatePercentVowels();
    }

}
