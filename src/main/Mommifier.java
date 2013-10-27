import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/24/13
 * Time: 1:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class Mommifier {

    private String inputString;
    private VowelReplacer vowelReplacer;

    public Mommifier(String inputString, VowelReplacer vowelReplacer) {
        this.inputString = inputString;
        this.vowelReplacer = vowelReplacer;
    }

    public String mommify() {

            if(inputString.equals("") || vowelReplacer.calculatePercentVowels() <= 30){
                return inputString;
            }

            return vowelReplacer.replaceVowels();
    }



}
