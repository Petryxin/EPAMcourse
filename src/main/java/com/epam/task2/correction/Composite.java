package com.epam.task2.correction;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements Printable {
    List<Printable> composite = new ArrayList<>();

    public void parse(){
    }

    @Override
    public void print() {
        for (Printable printable : composite) {
            printable.print();
        }
    }
}
