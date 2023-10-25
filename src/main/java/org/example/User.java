package org.example;

import java.util.Objects;

final class User {

    private final String lastName;

    private final String firstName;

    private final String email;


    private final String address;

    public User(String lastName, String firstName, String email, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.address = address;
    }

    public static UserBuilder create(EmailSend emailSend) {
        return UserBuilder.of(emailSend);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(lastName, user.lastName) && Objects.equals(firstName, user.firstName) && Objects.equals(email, user.email) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, email, address);
    }

    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
