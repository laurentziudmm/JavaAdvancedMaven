package map.problems;

import java.util.*;

public class Main {

    public static Set<String> uniqueTokens (String text) {
        Set<String> stringSet = new HashSet<>();
        String[] tokens = text.split("\\s|,\\s|\\.\\s|!|\\?|\\.");
        for(String token : tokens){
            stringSet.add(token);
        }
        return stringSet;
    }


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

//        System.out.println(wordCounting(Constants.TEXT));

//        Map<String,Integer> newWordCount = wordCounting(Constants.TEXT);
//        List <String>tokensList = new ArrayList(newWordCount.keySet());
//        Collections.sort(tokensList,new ComparatorLength());
//        Collections.reverse(tokensList);
//        for (String token : tokensList) {
//            System.out.println(token + " " + newWordCount.get(token));
//        }

        Set<String> newStringSet = uniqueTokens(Constants.TEXT);

        List<String> listString = new ArrayList<>(newStringSet);
        Collections.sort(listString);
        System.out.println(listString);

    }
}
