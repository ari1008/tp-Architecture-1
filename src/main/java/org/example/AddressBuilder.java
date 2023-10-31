package org.example;

import java.util.Objects;

final class AddressBuilder {

    private String nameStreet;

    private String nameCity;

    private String zipCode;

    public AddressBuilder setNameStreet(String nameStreet) {
        AddressBuilder addressBuilder = new AddressBuilder();
        addressBuilder.nameStreet = Objects.requireNonNull(nameStreet);
        addressBuilder.nameCity = nameCity;
        addressBuilder.zipCode = zipCode;
        return addressBuilder;
    }

    public AddressBuilder setNameCity(String nameCity) {
        AddressBuilder addressBuilder = new AddressBuilder();
        addressBuilder.nameStreet = nameStreet;
        addressBuilder.nameCity = Objects.requireNonNull(nameCity);
        addressBuilder.zipCode = zipCode;
        return addressBuilder;
    }

    public AddressBuilder setZipCode(String zipCode) {
        AddressBuilder addressBuilder = new AddressBuilder();
        addressBuilder.nameStreet = nameStreet;
        addressBuilder.nameCity = nameCity;
        addressBuilder.zipCode = Objects.requireNonNull(zipCode);
        return addressBuilder;
    }

    public Address build(){
        return new Address(nameStreet, nameCity, zipCode);
    }
}
