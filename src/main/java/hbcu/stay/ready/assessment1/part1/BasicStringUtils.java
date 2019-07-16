package hbcu.stay.ready.assessment1.part1;
import java.lang.Character;

/**
 * Created by leon on 2/16/18.
 */

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String newString = "";
        String [] strlist = str.split(" ");
        for (int i = 0; i < strlist.length; i++){
            String makeUpper = strlist[i].substring(0,1).toUpperCase();
            String concatStr = (makeUpper + strlist[i].substring(1));
            strlist[i] = concatStr;
        }

        //ugly but necessary _IN THIS CASE_
        for (int i = 0; i < strlist.length-1; i++){
            newString += strlist[i] + " ";
        }
        //for extra space issue
        newString += strlist[strlist.length-1];

        return newString;
    }

        /**
         * @param str string input from client
         * @return string with identical contents, in the reverse order
         */
    public static String reverse(String str) {
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString = newString +  str.charAt(i);
        }
        return newString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        String newString = "";
        String [] strlist = str.split(" ");
        for(int i = 0; i < strlist.length - 1; i++ ){
            newString = newString + reverse(strlist[i]) + " ";
        }
        newString += reverse(strlist[strlist.length-1]);
        return newString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String newString = "";
        newString = newString + camelCase(reverse(str)) ;
        return newString;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String newStr = "";
        for(int i = 1; i < str.length()-1;i++ ){
            newStr += str.charAt(i);
        }
        return newStr;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String newString = "";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            if (Character.isUpperCase(charArray[i])){
                newString += Character.toLowerCase(charArray[i]);
            } else{
                newString += Character.toUpperCase(charArray[i]);
            }
        }

        return newString;
    }
    }
