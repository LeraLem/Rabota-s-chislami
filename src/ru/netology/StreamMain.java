package ru.netology;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

    void main(List<Integer> intList){
        List<Integer> stream = intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println("Array with using Stream:" + stream);
    }

}
