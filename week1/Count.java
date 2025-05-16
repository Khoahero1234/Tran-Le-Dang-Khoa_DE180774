/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class Count {
    private Map<Character, Integer> charCounter;
    private Map<String, Integer> wordCounter;

    public Count() {
        charCounter = new HashMap<>();
        wordCounter = new HashMap<>();
    }

    public void analyze(String content) {
        countCharacters(content);
        countWords(content);
    }

    private void countCharacters(String content) {
        for (char ch : content.toCharArray()) {
            if (Character.isSpaceChar(ch)) continue;
            charCounter.put(ch, charCounter.getOrDefault(ch, 0) + 1);
        }
    }

    private void countWords(String content) {
        StringTokenizer tokenizer = new StringTokenizer(content);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            wordCounter.put(token, wordCounter.getOrDefault(token, 0) + 1);
        }
    }

    public Map<Character, Integer> getCharCounter() {
        return charCounter;
    }

    public Map<String, Integer> getWordCounter() {
        return wordCounter;
    }

    public void display() {
        System.out.println("Word frequencies: " + wordCounter);
        System.out.println("Character frequencies: " + charCounter);
    }
}
