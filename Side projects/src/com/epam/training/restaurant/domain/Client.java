package com.epam.training.restaurant.domain;

public class Client {

    private String name;
    private double happiness;

    public Client(String name, double happiness) {
        this.name = name;
        this.happiness = happiness;
    }

    public double getHappiness() {
        return happiness;
    }

    public void consume(Food food) {

    }

    @Override
    public String toString() {
        return "Client [name=" + name + ", happiness=" + happiness + "]";
    }

    public void update(Food food) {

    }
}
