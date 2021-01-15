package com.epam.training.restaurant.domain;

public class Ketchup extends FoodExtraDecorator {

    public Ketchup(Food food) {
        super(food);
    }

    @Override
    public double calculateHappiness(Client client) {
        return client.getHappiness() + (food.calculateHappiness(client) - client.getHappiness() * 2);
    }
}
