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
    public void equalObject(Object object, Object object1) {
        System.out.println(Object.class.getName() + " instances are equalObject : " + object.equals(object1));
    }
}
