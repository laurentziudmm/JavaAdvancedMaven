package map.problems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static Map<String, Integer> wordCounting(String text) {
        Map<String, Integer> wordMap = new TreeMap<>(Collections.<String>reverseOrder());
        //TreeMap Sorteaza text ul
        String[] tokens = text.split("\\s|,\\s|\\.\\s|!|\\?|\\.");
//        for (String token : tokens){
//            System.out.println(token);
//        }

        for (String token : tokens) {
            if (wordMap.containsKey(token)) {
                Integer counter = wordMap.get(token);
                wordMap.put(token, ++counter);
            } else {
                wordMap.put(token, 1);
            }
        }
        return wordMap;

    }

    public static void main(String[] args) {

        System.out.println(wordCounting(Constants.text));


    }
}
