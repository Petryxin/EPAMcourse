package com.epam.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

public class TextTest {
    String textJavaRush = "\tWhat is Collection in Java? A Collection represents a single unit of objects!\n" +
            "\tJava Collection framework provides many interfaces: Set, List, Queue, Deque.\n" +
            "And classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).";
    String simpleText = "\tWhat is: Collection, in Java?";

    @Test
    public void parseText(){
        Text txt = new Text(textJavaRush);
        txt.parse();

        long countOfCharsBeforeParsing = textJavaRush.chars().count();

        String textAfterParsing = SentenceItems.list.stream().collect(Collectors.joining(""));
        long countOfCharsAfterParsing = textAfterParsing.chars().count();

        Assertions.assertEquals(countOfCharsBeforeParsing,countOfCharsAfterParsing);
    }

    @Test
    public void swapFirstAndLastWord_LengthShouldBeEqual(){
        Text simple = new Text(simpleText);
        simple.parse();
        simple.swapFirstAndLastWord();

        long countOfCharsBeforeSwap = simpleText.chars().count();

        String textAfterSwap = SentenceItems.list.stream().collect(Collectors.joining(""));

        long countOfCharsAfterSwap = textAfterSwap.chars().count();

        Assertions.assertEquals(countOfCharsBeforeSwap,countOfCharsAfterSwap);
    }

    @Test
    public void deleteWordStartsWithConsonant(){
        Text simple = new Text(simpleText);
        simple.parse();
        simple.print();
        System.out.println();

        int size1 = Sentence.sentenceItemsList.size();

        simple.deleteWordStartsWithConsonant(4);
        simple.print();

        int size2 = Sentence.sentenceItemsList.size();

        Assertions.assertEquals(size1, size2);

    }

    @Test
    public void swapFirstAndLastWord(){

        Text simple = new Text("What do you do");
        simple.parse();
        simple.print();
        System.out.println();

        String firstWord = SentenceItems.list.get(0);

        simple.swapFirstAndLastWord();
        simple.print();
        String swapFirstWord = SentenceItems.list.get(6);

        Assertions.assertEquals(firstWord,swapFirstWord);
    }
}
