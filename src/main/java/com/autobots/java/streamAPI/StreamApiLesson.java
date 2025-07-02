package com.autobots.java.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiLesson {
    public static void main(String[] args) {

        List<String> names = List.of("Anna", "Andrew", "Bob");

//        List<String> namesWithA = new ArrayList<>();
//        for (String name : names) {
//            if (name.startsWith("A"))
//                namesWithA.add(name.toUpperCase());
//            Collections.sort(namesWithA);
//        }
//        System.out.println(namesWithA);

//        for (String name : names) {
//            if (name.startsWith("A"))
//                System.out.println(name.toUpperCase());
//        }

        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        int r1 = 0;
        for (int num : numbers) {
            r1 += num;
        }
        System.out.println(r1);

        int totalSum = numbers.stream()
                .mapToInt(num -> num)
                .sum();
        System.out.println(totalSum);

        int totalElements = (int) numbers.stream()
                        .count();
        System.out.println(totalElements);

        numbers.stream()
                .min(Integer::compareTo)
                .ifPresent(System.out::println);

        List<String> list = List.of("one", "two", "three", "Hello", "four", "five");
        list.stream()
                .filter(s -> s.length() > 3)
                .findFirst()
                .ifPresent(System.out::println);

//        List<Employee> employees = List.of(
//                new Employee(1, "Alice", 28, 3000, "IT"),
//                new Employee(2, "Bob", 35, 4000, "HR"),
//                new Employee(3, "Charlie", 40, 5000, "Finance"),
//                new Employee(4, "David", 25, 3500, "IT"),
//                new Employee(5, "Eva", 30, 4200, "Marketing"),
//                new Employee(6, "Frank", 45, 6000, "Finance"),
//                new Employee(7, "Grace", 32, 4100, "HR"),
//                new Employee(8, "Henry", 29, 3900, "IT"),
//                new Employee(9, "Isabel", 38, 4500, "Marketing"),
//                new Employee(10, "Jack", 27, 3600, "IT")
//        );
//
////        Map<String, List<Employee>> employeesByDepartment = employees.stream()
////                .collect(Collectors.groupingBy(Employee::getDepartment));
////        employeesByDepartment.forEach((department, list1) -> {
////            System.out.println("Отдел: " + department);
////            list1.forEach(System.out::println);
////        });
//
//        Map<String, List<Employee>> emplByDep = new HashMap<>();
//        for (Employee employee : employees) {
//            emplByDep.put(employee.getDepartment(), new ArrayList<>());
//            emplByDep.get(employee.getDepartment()).add(employee);
//        }
//        System.out.println(emplByDep);

//        List<Employee> ITEmployees = employees.stream()
//                .filter(s -> s.getDepartment().equalsIgnoreCase("IT"))
//                .collect(Collectors.toList());
//        System.out.println(ITEmployees);
//
//
//        List<Employee> ITEmployees2 = new ArrayList<>();
//        for (Employee employee : employees) {
//            if (employee.getDepartment().equalsIgnoreCase("IT")) {
//                ITEmployees2.add(employee);
//            }
//        }
//        System.out.println(ITEmployees2);


        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4 ,5));


    }
    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.endsWith("y"))
                .map(s -> s.concat("y"))
                .collect(Collectors.toList());

    }

    public Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        if (map.containsKey("c")) {
            map.remove("c");
        }
        return map;
    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");

        }
        map.put("bread", "butter");
        return map;
    }

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() > map.get("b").length()){
                map.put("c", map.get("a"));
            } else if (map.get("b").length() > map.get("a").length()){
                map.put("c", map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            map.put(str, 0);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, str.length());
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i].substring(0, 1), strings[i].substring(strings[i].length() - 1));
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            String firstLetter = str.substring(0,1);
            if (map.containsKey(firstLetter)) {
                String oldValue = map.get(firstLetter);
                map.put(firstLetter, oldValue + str);
            } else {
                map.put(firstLetter, str);
            }
        }
        return map;
    }

    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid -1, mid +1);
    }

    public String nTwice(String str, int n) {
        String first = str.substring(0, n);
        String last = str.substring(str.length() - n);
        return first + last;
    }

}
