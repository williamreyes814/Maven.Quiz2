package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        for (int i = 0; i <array.length ; i++) {
            if(array.length % 2 != 0);
            return false;


        }

        return true;
    }

    public Integer[] range(int start, int stop) {



        return null;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        int firstTwo = 0;

        for (int i = 0; i < 2; i++) {
            firstTwo += array[i];
        }

        return firstTwo;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        int lastTwo = array.length -2;
        int firstTwo = array.length -1;
        //for (int i = 0; i < array.length - 2; i++) {
        //    firstTwo *= array[i];
        //}
        //array.length -1 * array.length -2 = lastTwo;

        return lastTwo * firstTwo;
    }
}
