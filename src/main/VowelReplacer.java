import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/27/13
 * Time: 6:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class VowelReplacer {

    private String inputString;
    private String targetString;
    private static final String VOWELS = "aeiou";

    public VowelReplacer(String inputString, String targetString) {
        this.inputString = inputString;
        this.targetString = targetString;
    }

    public int calculatePercentVowels() {
        int percent = getNumberOfVowels() * 100 / inputString.length();
        return percent ;
    }

    public String replaceVowels() {
        return matchesOfPattern("[" + VOWELS + "]+").replaceAll(targetString);
    }

    private int getNumberOfVowels() {
        int count = 0;
        while (matchesOfPattern("[" + VOWELS + "]").find())
            count++;
        return count;
    }

    private Matcher matchesOfPattern(String patternRegEx) {

        Pattern pattern = Pattern.compile(patternRegEx);
        Matcher  matcher = pattern.matcher(inputString);
        return matcher;
    }
}
