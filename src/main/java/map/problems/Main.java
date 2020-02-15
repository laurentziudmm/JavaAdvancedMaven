package map.problems;

import java.util.*;

public class Main {



    public static Map<String, Integer> wordCounting(String text) {
        Map<String, Integer> wordMap = new HashMap<>();
        //TreeMap Sorteaza wordMap
        String[] tokens = text.split("\\s|,\\s|\\.\\s|!|\\?|\\.");

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

//        System.out.println(wordCounting(Constants.text));


        Map<String,Integer> newWordCount = wordCounting(Constants.text);
        List <String>tokensList = new ArrayList(newWordCount.keySet());
        Collections.sort(tokensList,Constants.comparatorLength);
        Collections.reverse(tokensList);
        for (String token : tokensList) {
            System.out.println(token + " " + newWordCount.get(token));
        }

    }
}
