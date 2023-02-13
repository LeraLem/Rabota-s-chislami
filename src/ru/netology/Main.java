package ru.netology;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        WithoutStreamMain mainWithoutStream = new WithoutStreamMain();
        StreamMain mainWithStream = new StreamMain();



        mainWithStream.main(intList);
        mainWithoutStream.main(intList);
    }

}
