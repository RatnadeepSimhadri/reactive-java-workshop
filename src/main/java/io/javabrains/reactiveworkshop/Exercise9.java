package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise9 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Print size of intNumbersFlux after the last item returns
        // TODO: Write code here
        // Answer: ReactiveSources.intNumbersFlux().count().subscribe(count -> System.out.println(count));
        
        // Collect all items of intNumbersFlux into a single list and print it
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().collectList().subscribe(System.out::println);

        // Transform to a sequence of sums of adjacent two numbers
        // TODO: Write code here
        System.out.println("Continuing the Main Thread");

        System.out.println("Press a key to end");
        System.in.read();
    }

}
