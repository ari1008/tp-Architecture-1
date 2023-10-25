package org.example;

import java.util.Objects;

final class UserBuilder {

    private final EmailSend emailSend;

    private UserBuilder(EmailSend emailSend) {
        this.emailSend = emailSend;
    }

    public static UserBuilder of(EmailSend emailSend) {
        return new UserBuilder(emailSend);
    }

    private  String lastName;

    private  String firstName;

    private  String email;


    private  String address;

    public UserBuilder setLastName(String lastName) {
        UserBuilder UserBuilder = new UserBuilder(emailSend);
        UserBuilder.lastName = Objects.requireNonNull(lastName);
        UserBuilder.firstName = firstName;
        UserBuilder.email = email;
        UserBuilder.address = address;
        return UserBuilder;
    }
    
    public UserBuilder setFirstName(String firstName) {
        UserBuilder UserBuilder = new UserBuilder(emailSend);
        UserBuilder.lastName = lastName;
        UserBuilder.firstName = Objects.requireNonNull(firstName);
        UserBuilder.email = email;
        UserBuilder.address = address;
        return UserBuilder;
    }
    
    public UserBuilder setEmail(String email) {
        UserBuilder UserBuilder = new UserBuilder(emailSend);
        UserBuilder.lastName = lastName;
        UserBuilder.firstName = firstName;
        UserBuilder.email = Objects.requireNonNull(email);
        UserBuilder.address = address;
        return UserBuilder;
    }
    
    public UserBuilder setAddress(String address) {
        UserBuilder UserBuilder = new UserBuilder(emailSend);
        UserBuilder.lastName = lastName;
        UserBuilder.firstName = firstName;
        UserBuilder.email = email;
        UserBuilder.address = Objects.requireNonNull(address);
        return UserBuilder;
    }
    
    public User build() {
        emailSend.sendEmail(this.email);
        return new User(lastName, firstName, email, address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserBuilder that = (UserBuilder) o;
        return Objects.equals(emailSend, that.emailSend) && Objects.equals(lastName, that.lastName) && Objects.equals(firstName, that.firstName) && Objects.equals(email, that.email) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailSend, lastName, firstName, email, address);
    }
}
