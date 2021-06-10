package com.epam.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Sentence implements TextService{
    public static List<SentenceItems> sentenceItemsList = new ArrayList<>();
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
        this.parse();
    }

    @Override
    public void parse() {
        String[] split = this.sentence.split("(?=[\\W])|(?<=[\\W])");

        List<String> listWords = new ArrayList<>(Arrays.asList(split));
        for (String str : listWords) {
            sentenceItemsList.add(new SentenceItems(str));
        }
    }

    @Override
    public void print() {
        for (SentenceItems sentenceItems : sentenceItemsList) {
            sentenceItems.print();
        }
    }

    @Override
    public void deleteWordStartsWithConsonant(int lengthOfWord) {
        for (SentenceItems sentenceItems : sentenceItemsList) {

            sentenceItems.deleteWordStartsWithConsonant(lengthOfWord);
        }
    }

    public List<Integer> getListOfWordsIndexes(){
        List<Integer> listOfIndexes = new ArrayList<>();
        for (SentenceItems sentenceItems : sentenceItemsList) {
            String s = sentenceItems.toString();
            boolean matches = s.matches("[a-zA-Z]+");
            if (matches){
                listOfIndexes.add(sentenceItemsList.indexOf(sentenceItems));
            }
        }
        return listOfIndexes;
    }

    @Override
    public void swapFirstAndLastWord() {
        int firstWord = getListOfWordsIndexes().get(0);
        int lastWord = getListOfWordsIndexes().get(getListOfWordsIndexes().size()-1);
        SentenceItems first = sentenceItemsList.get(firstWord);
        SentenceItems last = sentenceItemsList.get(lastWord);
        sentenceItemsList.set(firstWord,last);
        sentenceItemsList.set(lastWord,first);
    }
}
