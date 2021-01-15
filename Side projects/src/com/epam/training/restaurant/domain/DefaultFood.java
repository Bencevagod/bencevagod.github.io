package com.epam.training.restaurant.domain;

import java.util.List;

public class DefaultFood implements Food{

    protected List<FoodExtraDecorator> extras;

    @Override
    public double calculateHappiness(Client client) {
        return 0;
    }

    public List<FoodExtraDecorator> getExtras() {
        return extras;
    }

    public void setExtra(FoodExtraDecorator extra) {
        this.extras.add(extra);
    }
}
