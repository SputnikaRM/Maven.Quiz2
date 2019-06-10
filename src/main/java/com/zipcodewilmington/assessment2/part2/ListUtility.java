package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    ArrayList <Integer> arr =new ArrayList<>();



    public Boolean add(Integer i) {

         return arr.add(i);
    }

    public Integer size() {
        return arr.size();
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
        String join ="";
    for (int x=0; x<arr.size();x++)
        join = (arr.get(x)).toString();
        //return arr.toString();
        return join;
    }

    public Integer mostCommon() {

        return null;
    }

    public Boolean contains(Integer valueToAdd) {


        return arr.contains(valueToAdd);
    }
}
