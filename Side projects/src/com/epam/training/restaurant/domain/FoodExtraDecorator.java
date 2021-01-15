package com.epam.training.restaurant.domain;

public abstract class FoodExtraDecorator implements Food{

    protected final Food food;

    public FoodExtraDecorator(Food food) {
        this.food = food;
    }

    @Override
    public double calculateHappiness(Client client) {
        return this.food.calculateHappiness(client);
    }

    @Override
    public String toString() {
        return null;
    }
}
