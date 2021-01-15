package com.epam.training.restaurant.domain;

import java.util.List;

public class Order {

    private final String food;
    private final List<String> extras;
    private final Client client;

    public Order (String food, List<String> extras, Client client) {
        this.food = food.toUpperCase();
        extras.replaceAll(String::toUpperCase);
        this.extras = extras;
        this.client = client;
    }

    public String getFood() {
        return food;
    }

    public List<String> getExtras() {
        return extras;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Order [food=" + food + ", extras=" + extras.toString() + "]";
    }
}
