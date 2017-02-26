package com.Zynoz;

/**
 * Created by Zynoz on 27.02.2017.
 */

interface Executable {
    void execute();
}
class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block ...");
        e.execute();
    }
}

public class Lambda {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public void execute() {
                    System.out.println("Hello there.");
            }
        });
        System.out.println("=================");

        runner.run( () -> {
            System.out.println("Hello there.");
            System.out.println("This is code in a Lambda expression");
        });
    }
}