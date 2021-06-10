package com.epam.task2;


import java.util.ArrayList;
import java.util.List;


public class SentenceItems implements TextService{
    private String item;
    public static List<String> list = new ArrayList<>();


    public SentenceItems(String item) {
        this.item = item;
        list.add(item);
    }

    @Override
    public void print() {
        System.out.print(item);
    }

    @Override
    public void deleteWordStartsWithConsonant(int lengthOfWord) {
        boolean matches = item.matches("\\s?(?i)\\b(?=[^aeiouy])[a-z]{" + lengthOfWord + "}[,.?!]*");
        if (matches){
            item = "";
        }
    }

    @Override
    public void parse() {
    }

    @Override
    public void swapFirstAndLastWord() {
    }

    @Override
    public String toString() {
        return item;
    }
}

