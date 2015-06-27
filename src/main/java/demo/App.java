package demo;

import org.joda.time.LocalTime;

public class App {

    public static void main(String... args) {

        LocalTime time = new LocalTime();
        System.out.println("Current time: " + time);

        Greeter greeter = new Greeter();
        greeter.sayHello();
    }
}
