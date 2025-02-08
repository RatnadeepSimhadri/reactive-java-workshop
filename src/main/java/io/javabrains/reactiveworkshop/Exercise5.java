package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.concurrent.Flow.Subscription;

import reactor.core.publisher.BaseSubscriber;

public class Exercise5 {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // ReactiveSources.intNumbersFlux().subscribe(
        //     System.out::println, 
        //     err -> System.out.println(err.getMessage()), () -> System.out.println("Completed"));

        // Subscribe to a flux using an implementation of BaseSubscriber
   
        ReactiveSources.intNumbersFlux().subscribe(new MySubscriber());

        System.out.println("Press a key to end");
        System.in.read();
    }

}

class MySubscriber<T> extends BaseSubscriber<T> {
    public void hookOnSubscribe(Subscription subscription){
        System.out.println("Subscription Happened");
    }

    public void hookOnNext(T value){
        System.out.println(value.toString() + " received");
    }
}