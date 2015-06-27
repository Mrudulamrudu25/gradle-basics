package demo;

public class Greeter {
    private String name;

    public Greeter(String name) {
        this.name = name;
    }

    public Greeter() {
        this("World");
    }

    public void sayHello() {
        String greeting = "Hello, %s!";
        System.out.printf(greeting, this.name);
    }

}
