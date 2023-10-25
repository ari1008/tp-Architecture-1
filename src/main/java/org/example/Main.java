package org.example;

public class Main {
    public static void main(String[] args) {
        EmailSend emailSend = EmailSend.of();
        User user = UserBuilder
                .of(emailSend)
                .setLastName("Doe")
                .setFirstName("John")
                .setEmail("john.doe@address.com")
                .setAddress("address")
                .build();


        System.out.println(user);
    }
}