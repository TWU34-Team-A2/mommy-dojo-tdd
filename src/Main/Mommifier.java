/**
 * Created with IntelliJ IDEA.
 * User: dhruvk
 * Date: 25/10/13
 * Time: 6:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class Mommifier {


    private static final double THRESHOLD = 30.0;
    private static final String MOMMY = "mommy";

    public String mommify(String input) {

        if(Utilities.percentVowel(input) > THRESHOLD)
        {
            return input.replaceAll("[aeiou]+",MOMMY);
        }

        return input;
    }
}
