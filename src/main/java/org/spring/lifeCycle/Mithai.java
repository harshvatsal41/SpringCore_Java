package org.spring.lifeCycle;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Mithai {
    private String subject;

    public Mithai() {
        super();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Mithai{" +
                "subject='" + subject + '\'' +
                '}';
    }
    @PostConstruct
    public void init(){
        System.out.println("Ban gya");

    }
    @PreDestroy
    public void destroy(){
        System.out.println("Khtm");
    }
}
