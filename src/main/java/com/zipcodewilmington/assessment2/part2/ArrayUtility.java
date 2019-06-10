package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        //Integer[] newArr = new Integer[array1.length + array2.length];
        Integer[] newArr = new Integer[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            newArr[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            newArr[j] = array2[j - array1.length];
        }

        Integer[] newIntArr = Arrays.copyOf(newArr, newArr.length, Integer[].class);
        return newIntArr;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
