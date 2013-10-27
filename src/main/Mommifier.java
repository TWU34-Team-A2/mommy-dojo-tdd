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

    private VowelCalculations vowelCalculations = new VowelCalculations();

    public String mommify(String input) {
        if(shouldPhraseBeMommified(input))
            return "" + input.replaceAll("[aeiou]+", "mommy");
        else
            return input;
    }

    private boolean shouldPhraseBeMommified(String input) {
        if (vowelCalculations.doesVowelCountExceed30Percent(input) || input.equals(""))
            return true;
        return false;
    }

}
