package com.java8.streams.flatmap;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person("john", 26);
//
//        Optional<Person> personOptional = Optional.of(person);
//
//        Optional<Optional<String>> nameOptionalWrapper =
//                personOptional.map(Person::getName);
//
////        Optional<String> nameOptional =
////                nameOptionalWrapper.orElseThrow(IllegalArgumentException::new);
//
//        Optional<String> nameOptional =
//                nameOptionalWrapper.orElse(Optional.of(""));
//
//        String name1 = nameOptional.orElse("");
//        System.out.println(name1); // "john"
//
//        String name = personOptional
//                .flatMap(Person::getName)
//                .orElseGet(()-> "");
//
//        System.out.println(name);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        int result = numbers
//                .stream()
//                .reduce(0, (subtotal, element) -> subtotal + element);
//        System.out.println(result);

//        List<String> list = Arrays.asList("dog", "over","good");
//        //list.stream().reduce((x1, x2) -> x1.length() > x2.length() ? x1: x2).ifPresent(System.out::println);
//
//        System.out.println(list.stream().reduce(new String(), (s1, s2) -> s1+ s2.charAt(0), (c1,c2)->
//                 c1+=c2));

//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
//        for (int i= 1; i <= 3; i++){
//            list.add(i);
//            Spliterator<Integer> split = list.spliterator();
//            split.forEachRemaining(z-> System.out.println( z + ""));
//        }

        Predicate<String> lengther = (s)-> s.length() < 2;
        Predicate<String> equalizer = Predicate.isEqual("car");
        Function<Boolean, String> booleaner = i-> Boolean.toString(i);
        Function<String, Boolean> stringer = s-> Boolean.parseBoolean(s);

//        System.out.println(booleaner.andThen(stringer).apply("true"));
        System.out.println(booleaner.compose(stringer).apply("CAR"));

        System.out.println(stringer.compose(booleaner).apply(true));
        System.out.println(booleaner.apply("CAR".toLowerCase() != "car"));
        System.out.println(lengther.negate().or(equalizer).test("CAR"));

    }
}
