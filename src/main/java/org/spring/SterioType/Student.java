package org.spring.SterioType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("OB")
@Scope("singleton")
public class Student {

    @Value("Harsh Vatsal")
    private String Name;

    @Value("Delhi")
    private String city;

    @Value("#{frnd}")
    private List<String> friend;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public List<String> getFriend() {
        return friend;
    }

    public void setFriend(List<String> friend) {
        this.friend = friend;
    }



    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", city='" + city + '\'' +
                ", friend=" + friend + '\'' +
                '}';
    }
}
