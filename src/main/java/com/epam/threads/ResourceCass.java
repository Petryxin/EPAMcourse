package com.epam.threads;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceCass {
    private String name;
    private int numberOfResources;
    ReentrantLock lock = new ReentrantLock(true);

    public ResourceCass(String name, int numberOfResources) {
        this.name = name;
        this.numberOfResources = numberOfResources;
    }

    public void calculate(String infoNameOfCustomer, String numberOfCustomer){
        lock.lock();
        try {
            System.out.print(infoNameOfCustomer + " " + numberOfCustomer);
            System.out.println(" ->" + " расчитали" + " -> отработала касса " + name);
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
