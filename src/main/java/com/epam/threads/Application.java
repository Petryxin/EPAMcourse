package com.epam.threads;

import java.util.concurrent.Exchanger;


public class Application {

    public static void main(String[] args) {

        ResourceCass resourceCass = new ResourceCass("Cass_1",1);
        ResourceCass resourceCass2 = new ResourceCass("Cass_2",2);
        Exchanger<String> exchanger = new Exchanger<>();

        Customer customer1 = new Customer("Igor","100", resourceCass,exchanger);
        customer1.start();
        customer1.setSwapping(true);

        new Customer("Inna","200", resourceCass,exchanger).start();
        new Customer("Alex","300", resourceCass,exchanger).start();
        new Customer("Alla","400", resourceCass,exchanger).start();
        new Customer("Ira","500", resourceCass,exchanger).start();

        new Customer("Igor_11","1100", resourceCass2,exchanger).start();
        new Customer("Inna_12","1200", resourceCass2,exchanger).start();
        new Customer("Alex_13","1300", resourceCass2,exchanger).start();
        Customer customer14 = new Customer("Alla_14","1400", resourceCass2,exchanger);
        customer14.start();

        Customer customer15 = new Customer("Ira_15","1500", resourceCass2,exchanger);
        customer15.setSwapping(true);
        customer15.start();
    }
}
