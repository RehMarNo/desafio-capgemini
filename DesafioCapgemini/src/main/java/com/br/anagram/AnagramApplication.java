package com.br.anagram;

import com.br.anagram.service.AnagramAnalyzer;

import java.util.Scanner;

public class AnagramApplication {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        AnagramAnalyzer anagram = new AnagramAnalyzer();
        System.out.println("Digite uma palavra: ");
        String word = scan.nextLine();
        System.out.println(anagram.anagramAnalyzer(word));
    }
}
