package hbcu.stay.ready.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        return n+n;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {

        String reverse = "";
        String intString = val.toString();
        for (int i = intString.length()-1; i >= 0; i--){
            reverse += intString.charAt(i);
        }
        return Integer.parseInt(reverse);
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        if(val % 2 == 0) {
            return true;
        }
        return false;
    }
}

