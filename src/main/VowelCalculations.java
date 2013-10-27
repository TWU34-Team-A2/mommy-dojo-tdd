package main;

/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/27/13
 * Time: 4:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class VowelCalculations {

    public boolean doesVowelCountExceed30Percent(String input) {
        int numberOfVowels = findNumberOfVowels(input);
        return numberOfVowels>input.length()*.30;
    }

    public int findNumberOfVowels(String input) {
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            if(isVowel(input.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public boolean isVowel(char character) {
        return "aeiou".indexOf(character) != -1;
    }


}
