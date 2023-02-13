package ru.netology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WithoutStreamMain {
    void main(List<Integer> intList){
        List<Integer> newIntList = new ArrayList<>();

        for(Integer number : intList ) if (number > 0 && number % 2 == 0) newIntList.add(number);
        Collections.sort(newIntList);
        System.out.println("Array without using Stream:" + newIntList);
    }
}
