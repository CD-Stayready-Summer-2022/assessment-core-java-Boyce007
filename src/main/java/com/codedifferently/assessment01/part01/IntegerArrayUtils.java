package com.codedifferently.assessment01.part01;

public class IntegerArrayUtils {
    /**
     * Get the sum of all integers in array
     * @param intArray
     * @return
     */
    public static Integer getSum(Integer[] intArray){
        Integer sum = 0;
        for (int i = 0; i < intArray.length ; i++) {
            sum+=intArray[i];
        }


        return sum;
    }

    /**
     * Get the product of all integers in the array
     * @param intArray
     * @return
     */
    public static Integer getProduct(Integer[] intArray){
        Integer product = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            product*=intArray[i];
        }
        return product;
    }

    /**
     * Get the average of all integers in the array
     * @param intArray
     * @return
     */
    public static Double getAverage(Integer[] intArray) {
        Double  sum = Double.valueOf(getSum(intArray));
        Double numberOfElements = Double.valueOf(intArray.length);
        return sum / numberOfElements;
    }

}
