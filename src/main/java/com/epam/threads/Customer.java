package com.epam.threads;

import java.util.concurrent.Exchanger;

public class Customer extends Thread {
    private String name;
    private String sum;
    private ResourceCass resourceCass;
    private Exchanger<String> exchanger;
    private boolean swapping;

    public boolean isSwapping() {
        return swapping;
    }

    public void setSwapping(boolean swapping) {
        this.swapping = swapping;
    }

    public Customer(String name, String sum, ResourceCass resourceCass, Exchanger<String> exchanger) {
        this.name = name;
        this.sum = sum;
        this.resourceCass = resourceCass;
        this.exchanger = exchanger;
    }

    public void changeQueue(){
        if (swapping) {
            String previousName = this.name;
            String previousNumber = this.sum;
            System.out.println(Thread.currentThread().getName() + " " + this.name + " " + sum);
            try {
                    name = exchanger.exchange(name);
                    sum = exchanger.exchange(sum);
                    System.out.println(Thread.currentThread().getName() +
                            " exchanged " + previousName + " " + previousNumber + " for " + this.name + " " + sum);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        changeQueue();
        resourceCass.calculate(name, sum);
    }
}
