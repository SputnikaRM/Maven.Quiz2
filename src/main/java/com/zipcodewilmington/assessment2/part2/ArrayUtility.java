package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int size = array1.length + array2.length;
        int count =0;
        Integer [] merge = new  Integer[size];

        for(int x=0; x<array1.length;x++){
            merge[x] = array1[x];
            count++;
        }
        for(int y =0; y<array2.length;y++){
            merge[count] = array2[y];
            count++;
        }
        return merge;

    }

    public Integer[] rotate(Integer[] array, Integer index) {
        ArrayList <Integer> arr = new ArrayList<>();
        for(int x = index; x<array.length;x++)
            arr.add(array[x]);
        for(int y=0; y<index;y++)
            arr.add(array[y]);
        Integer[] answer = new Integer[arr.size()];
        answer = arr.toArray(answer);

        return answer;

    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count =0;
        for(int x=0; x< array1.length; x++){
            if(array1[x] == valueToEvaluate)
                count++;
        }
        for(int y=0; y<array2.length; y++){
            if(array2[y] == valueToEvaluate)
                count++;
        }
        return count;
    }

    public Integer mostCommon(Integer[] array) {
       return null;
    }
}
