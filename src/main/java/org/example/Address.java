package org.example;

import java.util.Objects;

final class Address {

    private final String nameStreet;

    private final String nameCity;

    private final String zipCode;


    public Address(String nameStreet, String nameCity, String zipCode) {
        this.nameStreet = nameStreet;
        this.nameCity = nameCity;
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(nameStreet, address.nameStreet) && Objects.equals(nameCity, address.nameCity) && Objects.equals(zipCode, address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameStreet, nameCity, zipCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "nameStreet='" + nameStreet + '\'' +
                ", nameCity='" + nameCity + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
