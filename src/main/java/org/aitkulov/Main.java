package org.aitkulov;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("test Integer");

        //test Integer
        Map<Integer, Integer> result = countOccurrencesOfElements(new Integer[] {1, 1, 1, 1, 1, 6, 7, 8, 9, 10});
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Occurrences:" + entry.getValue());
        }

        System.out.println("test String");

        //test String
        Map<String, Integer> result2 = countOccurrencesOfElements(new String[] {"a", "b", "c", "a", "b", "c", "a", "b", "c", "a"});
        for (Map.Entry<String, Integer> entry : result2.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Occurrences:" + entry.getValue());
        }

    }

    public static <T> Map<T, Integer> countOccurrencesOfElements(T[] array) {
        Map<T, Integer> resultMap = new HashMap<>();

        for (T obj : array) {
            resultMap.put(obj, resultMap.getOrDefault(obj, 0) + 1);
        }

        return resultMap;
    }
}