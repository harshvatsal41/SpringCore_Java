package org.spring.entities;

import java.io.StringReader;
import java.util.List;

public class Person {
    String name;
    private int personalId;
    private Certi certi;
    private List<String> list;
    public Person(String name,int personalId,Certi certi,List<String> list){
        this.name=name;
        this.personalId=personalId;
        this.certi = certi;
        this.list = list;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personalId=" + personalId +
                ", certi=" + certi +
                ", list=" + list +
                '}';
    }
}
