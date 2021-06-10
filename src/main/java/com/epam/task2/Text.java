package com.epam.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text implements TextService{

    private String text;

    public Text(String text) {
        this.text = text;
        this.parse();
    }

    List<Sentence> sentences = new ArrayList<>();

    @Override
    public void parse() {
        String[] split = this.text.split("(?<=[.?!])");
        List<String> listSentences = new ArrayList<>(Arrays.asList(split));
        for (String str : listSentences) {
            sentences.add(new Sentence(str));
        }
    }

    @Override
    public void print() {
        for (Sentence sentence: sentences) {
            sentence.print();
        }
    }

    @Override
    public void deleteWordStartsWithConsonant(int lengthOfWord) {
        for (Sentence sentence: sentences) {
            sentence.deleteWordStartsWithConsonant(lengthOfWord);
        }
    }

    @Override
    public void swapFirstAndLastWord() {
        for (Sentence sentence: sentences) {
            sentence.swapFirstAndLastWord();
        }
    }
}

