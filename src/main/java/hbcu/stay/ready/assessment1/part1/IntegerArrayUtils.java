package hbcu.stay.ready.assessment1.part1;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.*;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {

        int product = 0;
        for (int i = 1; i < intArray.length-1; i++) {
            product = intArray[i] * intArray[i+1];
            intArray[i+1] = product;
        }
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {

        double sum = 0;
        double avg = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        avg = (sum / intArray.length);
        return avg;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        Integer largest = 0;
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i]>largest){
                largest = intArray[i];
            }
        }
        return largest;
    }
}

