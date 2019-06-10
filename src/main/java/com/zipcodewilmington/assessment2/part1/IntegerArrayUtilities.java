package com.zipcodewilmington.assessment2.part1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        ArrayList <Integer> arr = new ArrayList<>();
        for (int x = start; x<=stop; x++){
            arr.add(x);
        }
        Integer[] answer = new Integer[arr.size()];
        answer = arr.toArray(answer);

        return answer;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

            int sum = array[0]+array[1];

        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        int x= array[array.length-1];
        int y = array[array.length-2];
        return x*y;
    }
}
