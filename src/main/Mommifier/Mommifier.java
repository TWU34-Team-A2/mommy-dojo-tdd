package Mommifier;

import java.util.ArrayList;

public class Mommifier {

    public String mommifyInputString(String inputString) {

        if(inputString.equals(""))
        {
            return "";
        }
        else
        {
          String outputString= replaceVowelWithMommy(inputString);
          return outputString;
        }
    }


    public String replaceVowelWithMommy(String inputString) {

        String result = "";
        int countVowels = 0;
        String vowels = "aeiou";

        for(int i=0; i<inputString.length(); i++){
            if(vowels.contains(inputString.substring(i,i+1))){
                countVowels++;
                if(!result.endsWith("mommy"))
                {
                    result += "mommy";
                }
            }
            else {
                result += inputString.substring(i,i+1);
            }

        }
        if(checkPercentageGrt30(countVowels,inputString.length()))
        {
            return result;
        }
        else
        {
            return inputString;
        }

    }

    public boolean checkPercentageGrt30(int noOfVowels, int lengthOfInput) {

        if(((double)noOfVowels/lengthOfInput * 100)>30.0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
