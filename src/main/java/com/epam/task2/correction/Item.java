package com.epam.task2.correction;

public class Item extends Composite {
    private String item;

    public Item(String item) {
        this.item = item;
    }

    @Override
    public void print() {
        System.out.println(item);
    }
}
