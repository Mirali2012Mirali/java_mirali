package urok;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maphw {

        public static void main(String[] args) {
            System.out.println("HashMap");
            hashMap();

            System.out.println("LinkedHashMap");
            linkedHashMap();

            System.out.println("TreeMap");
            treeMap();
        }


        public static void hashMap() {
            HashMap<String, Integer> students = new HashMap<>();

            students.put("Jack", 20);
            students.put("Joe", 19);
            students.put("John", 21);
            students.put("Kate", 22);
            students.put("Bob", 18);

            System.out.println("Список студентов: ");
            for (String name : students.keySet()) {
                System.out.println(name + " — " + students.get(name));
            }

            if (students.containsKey("Alice")) {
                System.out.println("Alice найдена!");
            } else {
                System.out.println("Alice нет в списке.");
            }

            students.remove("John");
            System.out.println("После удаления John: " + students);
        }


        public static void linkedHashMap() {
            LinkedHashMap<Integer, String> cities = new LinkedHashMap<>();

            cities.put(1, "Madrid");
            cities.put(2, "New-York");
            cities.put(3, "Paris");
            cities.put(4, "Berlin");
            cities.put(5, "Italy");

            System.out.println("Список городов:");
            for (Integer key : cities.keySet()) {
                System.out.println(key + " — " + cities.get(key));
            }

            System.out.println("Ключи: " + cities.keySet());
            System.out.println("Значения: " + cities.values());
        }


        public static void treeMap() {
            TreeMap<Integer, String> phoneBook = new TreeMap<>();

            phoneBook.put(5551234, "Ivan");
            phoneBook.put(5552345, "Maria");
            phoneBook.put(5553456, "John");
            phoneBook.put(5554567, "Kate");
            phoneBook.put(5555678, "Bob");

            System.out.println("Телефонная книга: ");
            for (Map.Entry<Integer, String> entry : phoneBook.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }

            System.out.println("Первый: " + phoneBook.firstEntry());
            System.out.println("Последний: " + phoneBook.lastEntry());
        }
    }