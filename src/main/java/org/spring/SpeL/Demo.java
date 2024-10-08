package org.spring.SpeL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{10>9?10:9}")
    private int a;

    @Value("#{T(java.lang.Math).sqrt(9)}")
    private int b;


    @Value("#{new java.lang.String('Harsh Verma')}")
    private String name;

    @Value("#{8>3 }")
    private boolean isActive;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "a=" + a +
                ", b=" + b +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
