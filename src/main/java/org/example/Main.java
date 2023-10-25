package org.example;

public class Main {
    public static void main(String[] args) {

        EmailSend emailSend = EmailSend.of("example.com");
        User userJohn = UserBuilder
                .of(emailSend)
                .setLastName("Doe")
                .setFirstName("John")
                .setEmail("john.doe@address.com")
                .setAddress("address")
                .build();
        System.out.println(userJohn);


        System.out.println("\n----- 2nd user -----\n");

        EmailSend emailSend2 = EmailSend.of("error.com");
        User userJane = UserBuilder
                .of(emailSend2)
                .setLastName("Doe2")
                .setFirstName("Jane")
                .setEmail("jane.doe@address2.com")
                .setAddress("address2")
                .build();


        System.out.println(userJane);


        System.out.println("\n----- Verification Singleton -----\n");


        System.out.println("EmailSend instances are equal: " + emailSend.equals(emailSend2));
        System.out.println("But EmailSend domains are equal: " + emailSend2.getDomain() + " == " + emailSend.getDomain());
    }
}