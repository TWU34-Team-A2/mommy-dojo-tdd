package main;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/24/13
 * Time: 11:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class Mommifier {

    public String mommify(String input) {
        if(input.equals("")) {
            return "";
        }

        if(doesVowelCountExceed30Percent(input)) {
            return "" + input.replaceAll("[aeiou]+", "mommy");
        }

        return input;
    }


    private boolean doesVowelCountExceed30Percent(String input) {
        int numberOfVowels = findNumberOfVowels(input);
        int lengthOfInput = input.length();
        return numberOfVowels>lengthOfInput*.30;
    }

    private int findNumberOfVowels(String input) {
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            if(isVowel(input.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char character) {
        char[] listOfVowels = new char[] {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < listOfVowels.length; i++) {
            if (character == listOfVowels[i])
                return true;
        }
        return false;
    }

}
