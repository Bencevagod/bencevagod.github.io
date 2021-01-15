package com.epam.training.restaurant.domain;

public class Ketchup extends FoodExtraDecorator {

    public Ketchup(Food food) {
        super(food);
    }

    @Override
    public double calculateHappiness(Client client) {
        return food.calculateHappiness(client) * 2;
    }
}
