package com.epam.task2.correction;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextComp extends Composite{
    private  String text;

    public TextComp(String text) {
        this.text = text;
        this.parse();
    }

    @Override
    public void parse() {
        String[] split = this.text.split("(?<=[.?!])");
        List<String> listSentences = new ArrayList<>(Arrays.asList(split));
        for (String str : listSentences) {
            composite.add(new SentenceComp(str));
        }
    }
}
