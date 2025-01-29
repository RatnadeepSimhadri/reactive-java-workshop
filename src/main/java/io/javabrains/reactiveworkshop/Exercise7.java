package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise7 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Print all values from intNumbersFlux that's greater than 5
        // TODO: Write code here
            // Answer: ReactiveSources.intNumbersFlux().log().filter(num -> num > 5).subscribe(System.out::println);
         // ReactiveSources.intNumbersFlux().filter(num -> num > 5).log().subscribe(System.out::println);

        // Print 10 times each value from intNumbersFlux that's greater than 5
        // TODO: Write code here
        // Answer: ReactiveSources.intNumbersFlux()
        //             .filter(num -> num > 5)
        //             .map(val -> 10 * val)
        //             .subscribe(System.out::println);

        // Print 10 times each value from intNumbersFlux for the first 3 numbers emitted that's greater than 5
        // TODO: Write code here
        // Answer: ReactiveSources.intNumbersFlux()
        //                 .filter(x -> x > 5)
        //                 .take(3)
        //                 .map(x -> x * 10)
        //                 .subscribe(System.out::println);
                        

        // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
        // TODO: Write code here
        // Answer: ReactiveSources.intNumbersFlux()
        //                 .filter( x -> x > 20)
        //                 .defaultIfEmpty(-1)
        //                 .subscribe(System.out::println);

        // Switch ints from intNumbersFlux to the right user from userFlux
        // TODO: Write code here
        // Answer: ReactiveSources.intNumbersFlux()
        //                 .flatMap(id -> ReactiveSources.userFlux().filter(user -> user.getId() == id ))
        //                 .subscribe(user -> System.out.println(user));

        // Print only distinct numbers from intNumbersFluxWithRepeat
        // TODO: Write code here
        ReactiveSources.intNumbersFluxWithRepeat()
                .distinct()
                .subscribe(System.out::println);

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
