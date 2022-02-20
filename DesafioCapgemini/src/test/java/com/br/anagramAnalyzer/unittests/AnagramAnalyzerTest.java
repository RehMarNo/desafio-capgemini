package com.br.anagramAnalyzer.unittests;

import com.br.anagram.service.AnagramAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramAnalyzerTest {
    /**
     * the test checks when a word has no anagram
     */
    @Test
    void shouldAnagramAnalyzerReturnZero() {
        AnagramAnalyzer anagram = new AnagramAnalyzer();
        Assertions.assertEquals(0, anagram.anagramAnalyzer("cao"));
    }

    /**
     * the test checks when the word has two anagrams
     */
    @Test
    void shouldAnagramAnalyzerReturnTwo() {
        AnagramAnalyzer anagram = new AnagramAnalyzer();
        Assertions.assertEquals(2, anagram.anagramAnalyzer("ovo"));
    }

    /**
     * the test checks when the word has three anagrams
     */
    @Test
    void shouldAnagramAnalyzerReturnThree() {
        AnagramAnalyzer anagram = new AnagramAnalyzer();
        Assertions.assertEquals(3, anagram.anagramAnalyzer("ifailuhkqq"));
    }
}
