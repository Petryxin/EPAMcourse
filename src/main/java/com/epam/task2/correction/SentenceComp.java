package com.epam.task2.correction;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentenceComp extends Composite {
    private String sentence;

    public SentenceComp(String sentence) {
        this.sentence = sentence;
        this.parse();
    }

    @Override
    public void parse() {
        String[] split = this.sentence.split("(?=[\\W])|(?<=[\\W])");
        List<String> listItems = new ArrayList<>(Arrays.asList(split));
        for (String str : listItems) {
            composite.add(new Item(str));
        }
    }
}
