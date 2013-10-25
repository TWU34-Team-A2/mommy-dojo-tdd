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

    private  String vowels = "aeiou";
    public String mommify(String inputString) {

            if(inputString.equals("") || calculatePercentVowels(inputString) <= 30){
                return inputString;
            }



            return replaceVowels(inputString);
    }

    private int calculatePercentVowels(String inputString)
    {
        String[] letters = inputString.split("(?!^)");
        int count = 0;
        for(String letter : letters)
        {
            if(vowels.contains(letter))
                count++;
        }

        int percent = count * 100 / letters.length;
        return percent ;
    }

    private String replaceVowels(String inputString)
    {
        String targetString = "mommy";

        Pattern pattern = Pattern.compile("[" + vowels + "]+");
        Matcher matcher = pattern.matcher(inputString);
        return matcher.replaceAll(targetString);

    }



}
