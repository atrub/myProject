package com.alfabank;

import java.util.*;
import java.util.stream.Collectors;

class Mapper{
    static void map(int k, int v){
        System.out.println("K: " + k + " V: " + v);
    }
}

public class Main1 {

    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Sam", Arrays.asList("Buddy", "Lucy", "Ass")),
                new Human("Bob", Arrays.asList("Frankie", "Rosie")),
                new Human("Marta", Arrays.asList("Simba", "Tilly")));

        System.out.println("\nStreams example:\n");

        List<String> petNames = humans.stream()
                .map(human -> human.getPets()) //преобразовываем Stream<Human> в Stream<List<Pet>>
                .flatMap(pets -> pets.stream())//"разворачиваем" Stream<List<Pet>> в Stream<Pet>
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        System.out.println(petNames); // output [Buddy, Lucy, Frankie, Rosie, Simba, Tilly]

        System.out.println("\nForEach example:\n");

        List<String> pets = new ArrayList<>();
        humans.forEach((h) -> h.getPets().forEach((p) -> pets.add(p)));
        System.out.println(pets);

        System.out.println("\nForeach for maps:\n");

        Map<Integer, Integer> numbers = new HashMap<>();
        // Java 9 way
        // private static final Map<String, String> test = Map.of("a", "b", "c", "d");
        numbers.put(1, 100);
        numbers.put(2, 200);
        numbers.put(3, 300);
        numbers.forEach((k, v) -> System.out.println("K: " + k + " V: " + v));
        // numbers.forEach(System.out::);
        System.out.println();
        numbers.forEach(Mapper::map);
    }
}
