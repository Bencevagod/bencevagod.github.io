package com.epam.training.restaurant.domain;

public class Mustard extends FoodExtraDecorator {

    public Mustard(Food food) {
        super(food);
    }

    @Override
    public double calculateHappiness(Client client) {
        return 1;
    }
}
