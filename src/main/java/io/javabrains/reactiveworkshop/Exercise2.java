package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        ReactiveSources.intNumbersFlux().subscribe(element -> {
            System.out.println(Thread.currentThread().getName()+" is logging "+ element);
        });

        // Print all users in the ReactiveSources.userFlux stream
        ReactiveSources.userFlux().subscribe(element -> {
            System.out.println(Thread.currentThread().getName()+" is logging "+ element);
        });

        System.out.println("Press a key to end");
        System.in.read();  // Waiting for User Action so that Stream can flow. Thread.sleep(15000); // wait 15 seconds
    }

    /**
     * 
     * Key Take Away is Reactive Programming can be Async. Reactive is just Push Based Programming Model 
     * The Flux might implement the Callback / Lambda in a separate thread or Main Thread 
     */

}
