package org.spring.Anotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    @Autowired
    Address address;

    public Person(Address address) {
        super();
        this.address = address;
    }

    public Person() {
        super();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                '}';
    }
}
