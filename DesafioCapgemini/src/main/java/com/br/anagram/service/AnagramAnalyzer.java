package com.br.anagram.service;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramAnalyzer {

    public Integer anagramAnalyzer(String word) {

        return anagramCount(word);
    }

    /**
     * the method calculates the number of anagrams that a word contains
     * @param word word is the String informed to check if it contains the anagram
     * @return the number of anagrams of a word
     */
    private Integer anagramCount(String word) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < word.length(); i++){
            for(int j = i; j < word.length(); j++){
                char[] charArray = word.substring(i, j+1).toCharArray();
                Arrays.sort(charArray);
                String ch = new String(charArray);
                if (map.containsKey(ch))
                    map.put(ch, map.get(ch)+1);
                else
                    map.put(ch, 1);
            }
        }
        int anagramCount = 0;
        // n can only have the value one or two
        for(String key: map.keySet()){
            int n = map.get(key);
            anagramCount += (n * (n-1))/2;
        }
        return anagramCount;
    }

}
