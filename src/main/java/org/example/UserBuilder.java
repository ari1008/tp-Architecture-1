package org.example;

import java.util.Objects;

final class UserBuilder {

    private final Email email;

    private UserBuilder(Email email) {
        this.email = email;
    }

    public static UserBuilder of(Email email) {
        return new UserBuilder(email);
    }

    private String lastName;

    private String firstName;

    private String emailUser;


    private Address address;

    public UserBuilder setLastName(String lastName) {
        UserBuilder userBuilder = new UserBuilder(email);
        userBuilder.lastName = Objects.requireNonNull(lastName);
        userBuilder.firstName = firstName;
        userBuilder.emailUser = emailUser;
        userBuilder.address = address;
        return userBuilder;
    }

    public UserBuilder setFirstName(String firstName) {
        UserBuilder userBuilder = new UserBuilder(email);
        userBuilder.lastName = lastName;
        userBuilder.firstName = Objects.requireNonNull(firstName);
        userBuilder.emailUser = emailUser;
        userBuilder.address = address;
        return userBuilder;
    }

    public UserBuilder setEmail(String emailUser) {
        UserBuilder userBuilder = new UserBuilder(email);
        userBuilder.lastName = lastName;
        userBuilder.firstName = firstName;
        userBuilder.emailUser = Objects.requireNonNull(emailUser);
        userBuilder.address = address;
        return userBuilder;
    }

    public UserBuilder setAddress(Address address) {
        UserBuilder userBuilder = new UserBuilder(email);
        userBuilder.lastName = lastName;
        userBuilder.firstName = firstName;
        userBuilder.emailUser = emailUser;
        userBuilder.address = Objects.requireNonNull(address);
        return userBuilder;
    }

    public User build() {
        email.sendEmail(this.emailUser);
        return new User(lastName, firstName, emailUser, address);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserBuilder that = (UserBuilder) object;
        return Objects.equals(email, that.email) && Objects.equals(lastName, that.lastName) && Objects.equals(firstName, that.firstName) && Objects.equals(emailUser, that.emailUser) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, lastName, firstName, email, address);
    }
}
