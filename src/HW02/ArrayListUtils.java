package HW02;

import java.util.ArrayList;

/**
 * Class that provides heTestlper functions for ArrayList
 */
public class ArrayListUtils {

    /**
     * Calculates total sum of all elements in the given array
     *
     * @param arr array list of integers for which we calculate sum
     * @return the total sum of all elements in the array
     */
    public static int sum(ArrayList<Integer> arr) {
        // TODO: implement this method on a separate branch. Should return sum of all elements in the array list
        int resultSum = 0;
        for(int i : arr) {
            resultSum = resultSum + i;
        }
        return resultSum;
    }

    /**
     * Calculates average value of all elements in the given array
     *
     * @param arr array list of integers for which we calculate average
     * @return average value of all elements in the array
     */
    public static int mean(ArrayList<Integer> arr) {
        // TODO: implement this method on a separate branch. Should return the average of elements in the array list
        int resultAverage = 0;
        int sum = 0;
        int size = arr.size();

        for(int i : arr) {
            sum = sum + i;
        }
        resultAverage = sum / size;

        return resultAverage;
    }
}