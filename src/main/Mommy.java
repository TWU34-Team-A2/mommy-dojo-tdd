import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: alacerda
 * Date: 10/24/13
 * Time: 11:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class Mommy {

    private final String MOMMY = "mommy";
    private final String VOWELS = "aeiou";
    private final float THIRTY_PERCENT = 0.3f;

    public String mommify(String s) {
        if (s.isEmpty())
            return "";

        float vowels = countVowels(s);

        if (vowels / s.length() < THIRTY_PERCENT) {
            return s;
        } else {
            return s.replaceAll("["+VOWELS+"]+", MOMMY);
        }
    }

    private float countVowels(String s) {
        float vowels = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels++;
            }
        }
        return vowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


}
