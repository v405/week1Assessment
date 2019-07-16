package hbcu.stay.ready.assessment1.part2;
import hbcu.stay.ready.assessment1.part1.BasicStringUtils;

import static hbcu.stay.ready.assessment1.part1.BasicStringUtils.*;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String [] strlist = sentence.split(" ");;
        return strlist;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String [] strlist = getWords(sentence);
        return strlist[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String newStr = "";
        String [] strlist = sentence.split(" ");
        newStr += reverse(strlist[0]) + " ";
        for (int i = 1;  i < strlist.length;i++){
            newStr += strlist[i];
        }
        return newStr;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String newStr = "";
        String [] strlist = sentence.split(" ");
        newStr += camelCase(reverse(strlist[0])) ;
        for (int i = 1;  i < strlist.length;i++){
            newStr += strlist[i];
        }
        return newStr;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String newStr = "";
        String[] strlist = str.split("");
        for(int i = 0; i < strlist.length; i++ ){
            if (strlist[i] != strlist[index]){
                newStr += strlist[i];
            }
        }
        return newStr;
    }

}
