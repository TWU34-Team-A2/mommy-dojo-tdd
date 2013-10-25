/**
 * Created with IntelliJ IDEA.
 * User: dhruvk
 * Date: 25/10/13
 * Time: 6:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class Utilities {
    public static double percentVowel(String input) {
        int numOfVowelsFound = 0;
        int lengthOfInput = input.length();

        for(int i=0; i<input.length(); i++)
        {
            if(isVowel(input.substring(i,i+1)))
            {

                numOfVowelsFound++;
            }
        }

        return (numOfVowelsFound*100.0)/input.length();
    }

    public static boolean isVowel(String input) {
        return (input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("u") || input.equals("o"));
    }
}
