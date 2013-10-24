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
    public String mommify(String s) {
        if (s.isEmpty())
            return "";

        Pattern p = Pattern.compile("(a)b");
        Matcher matcher = p.matcher("ababa");
        System.out.println(matcher.groupCount());

        float vowels = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
        }

        if (vowels / s.length() < 30f / 100f) {
            return s;
        }         else {
            return s.replaceAll("[aeiou]+", "mommy");
        }
    }


}
