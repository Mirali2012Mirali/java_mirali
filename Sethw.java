package urok;

import java.util.*;

public class Sethw {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Баку");
        cities.add("Мадрид");
        cities.add("Анкара");
        cities.add("Амстердам");
        cities.add("Париж");

        boolean added = cities.add("Баку");

        System.out.println("HashSet: " + cities);
        System.out.println(added);
        System.out.println("--------------");

        LinkedHashSet<String> citiesLinked = new LinkedHashSet<>();
        citiesLinked.add("Москва");
        citiesLinked.add("Баку");
        citiesLinked.add("Анкара");
        citiesLinked.add("Берлин");
        citiesLinked.add("Париж");

        System.out.println("LinkedHashSet: " + citiesLinked);
        System.out.println("--------------");

        TreeSet<Integer> numbersTree = new TreeSet<>();
        numbersTree.add(50);
        numbersTree.add(10);
        numbersTree.add(30);
        numbersTree.add(20);
        numbersTree.add(40);

        System.out.println("TreeSet: " + numbersTree);
        System.out.println("-------------");

        NavigableSet<Integer> numbers = new TreeSet<>();
        numbers.addAll(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("NavigableSet: " + numbers);
        System.out.println("higher: " + numbers.higher(25));
        System.out.println("floor: " + numbers.floor(25));
        System.out.println("descendingSet(): " + numbers.descendingSet());
    }
}