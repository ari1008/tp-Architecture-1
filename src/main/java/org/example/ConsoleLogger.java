package org.example;

public class ConsoleLogger implements Logger {
    @Override
    public void of(String input) {
        System.out.println(input);
    }

    @Override
    public void toStringObject(Object object){
        System.out.println(object.toString());
    }

    @Override
    public void equal(Object object, Object object1) {
        System.out.println(Object.class.getName() + " instances are equal : " + Object.class.equals(object1));
    }
}
