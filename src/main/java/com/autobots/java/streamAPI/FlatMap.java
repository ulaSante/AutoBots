package com.autobots.java.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> nestedList = List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("E")
        );
        System.out.println(nestedList);

        List<String> nonNestedList = new ArrayList<>();
        for (List<String> list : nestedList) {
            nonNestedList.addAll(list);
        }
        System.out.println(nonNestedList);

        List<String> nonNestedListWithStream = nestedList.stream()
                .flatMap(List -> List.stream()).toList();
        System.out.println(nonNestedListWithStream);

    }
}
