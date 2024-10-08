package org.spring.entities;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employes {
    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String,String> Roll_No;

    public Employes() {
        super();
    }

    public Employes(String name, List<String> phones, Set<String> address, Map<String, String> roll_No) {
        super();
        this.name = name;
        this.phones = phones;
        this.address = address;
        Roll_No = roll_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getRoll_No() {
        return Roll_No;
    }

    public void setRoll_No(Map<String, String> roll_No) {
        Roll_No = roll_No;
    }
}
