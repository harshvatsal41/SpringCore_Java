package org.spring.lifeCycle;

public class samosa {
    private double price;

    public samosa() {
        super();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting property");
        this.price = price;
    }


    public void init(){
        System.out.println("Inside init method");
    }
    public void destroy(){
        System.out.println("Inside destroy method");
    }
}
