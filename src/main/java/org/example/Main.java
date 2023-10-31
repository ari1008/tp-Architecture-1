package org.example;

public class Main {
    public static void main(String[] args) {

        Logger logger = new ConsoleLogger();

        Email email = Email.of("example.com", logger);
        User userJohn = UserBuilder
                .of(email)
                .setLastName("Doe")
                .setFirstName("John")
                .setEmail("john.doe@address.com")
                .setAddress(
                        new AddressBuilder()
                                .setNameStreet("Who")
                                .setNameCity("WhoCity")
                                .setZipCode("0007")
                                .build()
                )
                .build();
        logger.toStringObject(userJohn);


        logger.of("\n----- 2nd user -----\n");

        Email email2 = Email.of("error.com", logger);
        User userJane = UserBuilder
                .of(email2)
                .setLastName("Doe2")
                .setFirstName("Jane")
                .setEmail("jane.doe@address2.com")
                .setAddress(
                        new AddressBuilder()
                                .setNameStreet("Hello")
                                .setNameCity("Friends")
                                .setZipCode("1234")
                                .build()
                )
                .build();


        logger.toStringObject(userJane);


        logger.of("\n----- Verification Singleton -----\n");

        logger.equal(email2, email);
        logger.of("But EmailSend domains are equal: " + email2.getDomain() + " == " + email.getDomain());
    }
}