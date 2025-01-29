package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Flux;

import java.io.IOException;

public class Exercise8 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFluxWithException()

        // Print values from intNumbersFluxWithException and print a message when error happens
        // TODO: Write code here
        // ReactiveSources.intNumbersFluxWithException()
        //         .subscribe(System.out::println, err -> System.out.println(err.getMessage()));

        // Answer : ReactiveSources.intNumbersFluxWithException()
        //                .doOnError(e -> System.out.println(e.getMessage()))
        //                .subscribe(System.out::println);
                       

        // Print values from intNumbersFluxWithException and continue on errors
        // TODO: Write code here
        ReactiveSources.intNumbersFluxWithException()
                       .onErrorContinue((e,item) -> System.out.println(e.getMessage()))
                       .subscribe(System.out::println);

        // Print values from intNumbersFluxWithException and when errors
        // happen, replace with a fallback sequence of -1 and -2
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
