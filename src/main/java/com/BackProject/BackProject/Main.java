package com.BackProject.BackProject;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);

        Map<Integer, List<Integer>> maps = numbers.stream().collect(Collectors.groupingBy(x -> x));

        for (List<Integer> rows : maps.values()){
            System.out.println(rows);
        }
//
//        numbers.stream()
//                .sorted()
//                .forEach(out::println);
//        IntSummaryStatistics papu = numbers.stream()
//                .map((x) ->x)
//                .summaryStatistics();
//
//        for(String: new HashMap<>().values()) {
//
//        }
    }

    public void execution(){
        Animal animal = new Fish();
        Fish fish= (Fish)animal;

    }

    class Animal {
        public void getName() {
            out.println("this is an animal");
        }
    }

    class Fish extends Animal{
        public void getName() {
            out.println("this is an animal");
        }
    }

    class Feline extends  Animal{
        public void getName() {
            out.println("this is an animal");
        }
    }
}






